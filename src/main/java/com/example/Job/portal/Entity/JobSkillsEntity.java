package com.example.Job.portal.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "JobSkills")
public class JobSkillsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JoinColumn(name = "jobId" , referencedColumnName = "id")
    private JobEntity jobEntity;

    @JoinColumn(name = "skillId" , referencedColumnName = "id")
    private SkillsEntity skillsEntity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public JobEntity getJobEntity() {
        return jobEntity;
    }

    public void setJobEntity(JobEntity jobEntity) {
        this.jobEntity = jobEntity;
    }

    public SkillsEntity getSkillsEntity() {
        return skillsEntity;
    }

    public void setSkillsEntity(SkillsEntity skillsEntity) {
        this.skillsEntity = skillsEntity;
    }

    public JobSkillsEntity() {
    }

    public JobSkillsEntity(int id, JobEntity jobEntity, SkillsEntity skillsEntity) {
        this.id = id;
        this.jobEntity = jobEntity;
        this.skillsEntity = skillsEntity;
    }
}
