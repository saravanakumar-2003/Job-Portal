package com.example.Job.portal.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Skills")
public class SkillsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String skill;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public SkillsEntity() {
    }

    public SkillsEntity(int id, String skill) {
        this.id = id;
        this.skill = skill;
    }
}
