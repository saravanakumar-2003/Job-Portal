package com.example.Job.portal.Service;

import com.example.Job.portal.DTO.CandidateDTO;
import com.example.Job.portal.DTO.UpdateSkillsDTO;
import com.example.Job.portal.Entity.CandidateEntity;
import com.example.Job.portal.Repository.CandidateRepository;
import jakarta.persistence.Access;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CandidateService {

    @Autowired
    CandidateRepository candidateRepository;

    public void register(CandidateDTO candidate) {

        CandidateEntity candidateEntity = new CandidateEntity();
        candidateEntity.setName(candidate.getName());
        candidateEntity.setEmail(candidate.getEmail());
        candidateEntity.setMobile(candidate.getMobile());
        candidateEntity.setSkills(candidate.getSkills());
        candidateEntity.setExperience(candidate.getExperience());
        candidateEntity.setLocations(candidate.getLocations());

        candidateRepository.save(candidateEntity);
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

    @Transactional
    public void updateSkills(UpdateSkillsDTO updateSkillsDTO) {
        candidateRepository.updateSkills(updateSkillsDTO.getEmail(), updateSkillsDTO.getSkills());
    }
}
