package com.example.Job.portal.Entity;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.security.oauth2.resource.ConditionalOnIssuerLocationJwtDecoder;

@Entity
@Table(name = "Recruiter")
public class RecruiterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @JoinColumn(name = "companyId", referencedColumnName = "id")
    private CompanyEntity company;

    @Column
    private String email;

    @Column
    private String mobile;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CompanyEntity getCompany() {
        return company;
    }

    public void setCompany(CompanyEntity company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public RecruiterEntity() {
    }

    public RecruiterEntity(int id, String name, CompanyEntity company, String email, String mobile) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.email = email;
        this.mobile = mobile;
    }
}
