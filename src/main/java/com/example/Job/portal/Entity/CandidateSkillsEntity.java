package com.example.Job.portal.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "CandidateSkills")
public class CandidateSkillsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "candidateId" , referencedColumnName = "id")
    private CandidateEntity candidateEntity;

    @ManyToOne
    @JoinColumn(name = "skillId" , referencedColumnName = "id")
    private SkillsEntity skillsEntity;

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

    public SkillsEntity getSkillsEntity() {
        return skillsEntity;
    }

    public void setSkillsEntity(SkillsEntity skillsEntity) {
        this.skillsEntity = skillsEntity;
    }

    public CandidateSkillsEntity() {
    }

    public CandidateSkillsEntity(int id, CandidateEntity candidateEntity, SkillsEntity skillsEntity) {
        this.id = id;
        this.candidateEntity = candidateEntity;
        this.skillsEntity = skillsEntity;
    }
}
