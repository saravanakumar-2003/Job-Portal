package com.example.Job.portal.DTO;


public class RecruiterDTO {

    private String name;
    private String email;
    private String mobile;
    private String companyName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public RecruiterDTO() {
    }

    public RecruiterDTO(String name, String email, String mobile, String companyName) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.companyName = companyName;
    }
}
