package com.example.Job.portal.Entity;

import jakarta.persistence.*;
import org.hibernate.type.internal.UserTypeSqlTypeAdapter;

@Entity
@Table(name = "Company")
public class CompanyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String companyName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public CompanyEntity() {
    }

    public CompanyEntity(int id, String companyName) {
        this.id = id;
        this.companyName = companyName;
    }
}
