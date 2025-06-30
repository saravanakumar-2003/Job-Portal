package com.example.Job.portal.Entity;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name = "Jobs")
public class JobEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private String role;

    @Column
    private String location;

    @Column
    private int experience;

    @ManyToOne
    @JoinColumn(name = "companyId" , referencedColumnName = "id")
    private CompanyEntity companyEntity;

    @OneToOne
    @JoinColumn(name = "recruiterId" , referencedColumnName = "id")
    private RecruiterEntity recruiterEntity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public CompanyEntity getCompanyEntity() {
        return companyEntity;
    }

    public void setCompanyEntity(CompanyEntity companyEntity) {
        this.companyEntity = companyEntity;
    }

    public RecruiterEntity getRecruiterEntity() {
        return recruiterEntity;
    }

    public void setRecruiterEntity(RecruiterEntity recruiterEntity) {
        this.recruiterEntity = recruiterEntity;
    }

    public JobEntity() {
    }

    public JobEntity(int id, String role, String location, int experience, CompanyEntity companyEntity, RecruiterEntity recruiterEntity) {
        this.id = id;
        this.role = role;
        this.location = location;
        this.experience = experience;
        this.companyEntity = companyEntity;
        this.recruiterEntity = recruiterEntity;
    }
}