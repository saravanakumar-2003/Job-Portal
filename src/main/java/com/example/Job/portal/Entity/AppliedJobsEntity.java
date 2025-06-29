package com.example.Job.portal.Entity;

import jakarta.persistence.*;
import org.springframework.web.service.annotation.GetExchange;

import java.util.Optional;

@Entity
@Table(name = "Applied Jobs")
public class AppliedJobsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @OneToOne
    @JoinColumn(name = "candidateId" , referencedColumnName = "id")
    private CandidateEntity candidateEntity;
    
    @Column
    private int jobId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CandidateEntity getCandidateEntity() {
        return candidateEntity;
    }

    public void setCandidateEntity(CandidateEntity candidateEntity) {
        this.candidateEntity = candidateEntity;
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public AppliedJobsEntity() {
    }

    public AppliedJobsEntity(int id, CandidateEntity candidateEntity, int jobId) {
        this.id = id;
        this.candidateEntity = candidateEntity;
        this.jobId = jobId;
    }
}
