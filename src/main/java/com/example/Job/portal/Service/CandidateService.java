package com.example.Job.portal.Service;

import com.example.Job.portal.DTO.AppliedJobsDTO;
import com.example.Job.portal.DTO.CandidateDTO;
import com.example.Job.portal.DTO.FindMatchDTO;
import com.example.Job.portal.DTO.UpdateSkillsDTO;
import com.example.Job.portal.Entity.*;
import com.example.Job.portal.Repository.*;
import jakarta.persistence.Access;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Objects;

@Service
public class CandidateService {

    @Autowired
    CandidateRepository candidateRepository;

    @Autowired
    JobRepository jobRepository;

    @Autowired
    AppliedJobRepository appliedJobRepository;

    @Autowired
    SkillsRepository skillsRepository;

    @Autowired
    CandidateSkillsRepository candidateSkillsRepository;

    @Autowired
    JobSkillsRepository jobSkillsRepository;

    public void register(CandidateDTO candidate) {

        CandidateEntity candidateEntity = new CandidateEntity();
        candidateEntity.setName(candidate.getName());
        candidateEntity.setEmail(candidate.getEmail());
        candidateEntity.setMobile(candidate.getMobile());
        candidateEntity.setExperience(candidate.getExperience());
        candidateEntity.setLocation(candidate.getLocation());

        candidateRepository.save(candidateEntity);

        for(String skill : candidate.getSkills()) {

            if(skillsRepository.findBySkill(skill) == null){
                SkillsEntity skillsEntity = new SkillsEntity();
                skillsEntity.setSkill(skill);
                skillsRepository.save(skillsEntity);
            }

            CandidateSkillsEntity candidateSkillsEntity = new CandidateSkillsEntity();
            candidateSkillsEntity.setCandidateEntity(candidateEntity);
            candidateSkillsEntity.setSkillsEntity(skillsRepository.findBySkill(skill));
            candidateSkillsRepository.save(candidateSkillsEntity);
        }


    }

    public String login(String email){
        CandidateEntity candidate = candidateRepository.findByEmail(email);
        if(candidate != null){
            return "Login successful" ;
        }
        else{
            return "user not found. Please register";
        }
    }


    public void applyJob(AppliedJobsDTO appliedJobsDTO) {
        AppliedJobsEntity appliedJobsEntity = new AppliedJobsEntity();

        appliedJobsEntity.setCandidateEntity(candidateRepository.findByEmail(appliedJobsDTO.getCandidateEmail()));
        appliedJobsEntity.setJobId(appliedJobsDTO.getJobId());
        appliedJobRepository.save(appliedJobsEntity);
    }

    @Transactional
    public void editSkills(UpdateSkillsDTO updateSkillsDTO) {

        CandidateEntity candidate = candidateRepository.findByEmail(updateSkillsDTO.getEmail());
        candidateSkillsRepository.deleteByCandidateEntity(candidate);

        for(String skill : updateSkillsDTO.getSkills()){

            CandidateSkillsEntity candidateSkillsEntity = new CandidateSkillsEntity();
            candidateSkillsEntity.setCandidateEntity(candidate);
            candidateSkillsEntity.setSkillsEntity(skillsRepository.findBySkill(skill));
            candidateSkillsRepository.save(candidateSkillsEntity);
        }
    }

    public float findMatch(FindMatchDTO findMatchDTO) {

        ArrayList<CandidateSkillsEntity> candidateSkillsEntities = candidateSkillsRepository.findAllByCandidateEntity(candidateRepository.findByEmail(findMatchDTO.getCandidateEmail()));
        ArrayList<JobSkillsEntity> jobSkillsEntities = jobSkillsRepository.findAllByJobEntity(jobRepository.findByRole(findMatchDTO.getJobRole()));

        float count = 0;
        for(JobSkillsEntity jobskillsEntity : jobSkillsEntities){

            for(CandidateSkillsEntity candidateSkillsEntity : candidateSkillsEntities){

                if(Objects.equals(jobskillsEntity.getSkillsEntity(), candidateSkillsEntity.getSkillsEntity())){
                    count++;
                }
            }
        }
        return (count/jobSkillsEntities.size()) * 100;
    }
}
