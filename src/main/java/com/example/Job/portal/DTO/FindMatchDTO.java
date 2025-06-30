package com.example.Job.portal.DTO;

public class FindMatchDTO {

    private String candidateEmail;
    private String jobRole;

    public String getCandidateEmail() {
        return candidateEmail;
    }

    public void setCandidateEmail(String candidateEmail) {
        this.candidateEmail = candidateEmail;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    public FindMatchDTO() {
    }

    public FindMatchDTO(String candidateEmail, String jobRole) {
        this.candidateEmail = candidateEmail;
        this.jobRole = jobRole;
    }
}
