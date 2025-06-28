package com.example.Job.portal.Controller;

import com.example.Job.portal.DTO.JobDTO;
import com.example.Job.portal.DTO.RecruiterDTO;
import com.example.Job.portal.Service.RecruiterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RecruiterController {

    @Autowired
    RecruiterService recruiterService;

    @PostMapping("/registerRecruiter")
    public void registerRecruiter(@RequestBody RecruiterDTO recruiter){
        recruiterService.register(recruiter);
        recruiterService.login(recruiter.getEmail());
    }

    @GetMapping("/loginRecruiter")
    public void login(@RequestParam String email){
        recruiterService.login(email);
    }

    @PostMapping("/addJob")
    public void addJob(@RequestBody JobDTO job){
        recruiterService.addJob(job);
    }
}
