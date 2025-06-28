package com.example.Job.portal.Controller;

import com.example.Job.portal.DTO.CandidateDTO;
import com.example.Job.portal.Service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CandidateController {

    @Autowired
    CandidateService candidateService;

    @PostMapping("/registerCandidate")
    public void register(@RequestBody CandidateDTO candidate){
        candidateService.register(candidate);
        candidateService.login(candidate.getEmail());
    }

    @GetMapping("/loginCandidate")
    public void login(@RequestParam String email){
        candidateService.login(email);
    }



}
