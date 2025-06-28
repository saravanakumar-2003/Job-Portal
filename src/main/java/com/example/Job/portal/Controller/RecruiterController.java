package com.example.Job.portal.Controller;

import com.example.Job.portal.DTO.RecruiterDTO;
import com.example.Job.portal.Service.RecruiterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecruiterController {

    @Autowired
    RecruiterService recruiterService;

    @PostMapping("/registerRecruiter")
    public void registerRecruiter(@RequestBody RecruiterDTO recruiter){
        recruiterService.register(recruiter);
    }
}
