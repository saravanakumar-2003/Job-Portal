package com.example.Job.portal.Service;

import com.example.Job.portal.DTO.RecruiterDTO;
import com.example.Job.portal.Entity.CompanyEntity;
import com.example.Job.portal.Entity.RecruiterEntity;
import com.example.Job.portal.Repository.CompanyRepository;
import com.example.Job.portal.Repository.RecruiterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecruiterService {
    @Autowired
    RecruiterRepository recruiterRepository;

    @Autowired
    CompanyRepository companyRepository;

    public void register(RecruiterDTO recruiter) {

        RecruiterEntity recruiterEntity = new RecruiterEntity();

        recruiterEntity.setName(recruiter.getName());
        recruiterEntity.setEmail(recruiter.getEmail());
        recruiterEntity.setMobile(recruiter.getMobile());

        CompanyEntity companyEntity = companyRepository.findByCompanyName(recruiter.getCompanyName());
        if(companyEntity == null){
            CompanyEntity companyEntity1 = new CompanyEntity();
            companyEntity1.setCompanyName(recruiter.getCompanyName());
            companyRepository.save(companyEntity1);
            companyEntity = companyEntity1;
        }

        recruiterEntity.setCompany(companyEntity);
        recruiterRepository.save(recruiterEntity);
    }
}
