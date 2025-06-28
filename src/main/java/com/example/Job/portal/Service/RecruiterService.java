package com.example.Job.portal.Service;

import com.example.Job.portal.DTO.JobDTO;
import com.example.Job.portal.DTO.RecruiterDTO;
import com.example.Job.portal.Entity.CompanyEntity;
import com.example.Job.portal.Entity.JobEntity;
import com.example.Job.portal.Entity.RecruiterEntity;
import com.example.Job.portal.Repository.CompanyRepository;
import com.example.Job.portal.Repository.JobRepository;
import com.example.Job.portal.Repository.RecruiterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecruiterService {
    @Autowired
    RecruiterRepository recruiterRepository;

    @Autowired
    CompanyRepository companyRepository;

    @Autowired
    JobRepository jobRepository;


    public void register(RecruiterDTO recruiter) {

        RecruiterEntity recruiterEntity = new RecruiterEntity();

        recruiterEntity.setName(recruiter.getName());
        recruiterEntity.setEmail(recruiter.getEmail());
        recruiterEntity.setMobile(recruiter.getMobile());

        CompanyEntity companyEntity = companyRepository.findByCompanyName(recruiter.getCompanyName());
        if (companyEntity == null) {
            CompanyEntity companyEntity1 = new CompanyEntity();
            companyEntity1.setCompanyName(recruiter.getCompanyName());
            companyRepository.save(companyEntity1);
            companyEntity = companyEntity1;
        }

        recruiterEntity.setCompany(companyEntity);
        recruiterRepository.save(recruiterEntity);
    }

    public String login(String email) {
        RecruiterEntity recruiter = recruiterRepository.findByEmail(email);
        if (recruiter != null) {
            return "Login successful";
        } else {
            return "user not found. Please register";
        }
    }

    public void addJob(JobDTO job) {
        JobEntity jobEntity = new JobEntity();

        jobEntity.setRole(job.getRole());
        jobEntity.setExperience(job.getExperience());
        jobEntity.setSkills(job.getSkills());
        jobEntity.setLocations(job.getLocations());

        RecruiterEntity recruiter = recruiterRepository.findByEmail(job.getRecruiterEmail());

        jobEntity.setRecruiterEntity(recruiter);
        jobEntity.setCompanyEntity(recruiter.getCompany());

        jobRepository.save(jobEntity);
    }
}

