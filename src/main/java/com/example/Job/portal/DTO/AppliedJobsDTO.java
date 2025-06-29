package com.example.Job.portal.DTO;

public class AppliedJobsDTO {

    private String candidateEmail;
    private int jobId;

    public String getCandidateEmail() {
        return candidateEmail;
    }

    public void setCandidateEmail(String candidateEmail) {
        this.candidateEmail = candidateEmail;
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public AppliedJobsDTO() {
    }

    public AppliedJobsDTO(String candidateEmail, int jobId) {
        this.candidateEmail = candidateEmail;
        this.jobId = jobId;
    }
}
