package com.example.Job.portal.DTO;

import java.util.ArrayList;

public class CandidateDTO {
    private String name;
    private String email;
    private String mobile;
    private int experience;
    private ArrayList<String> skills;
    private String location;

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

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public CandidateDTO() {
    }

    public CandidateDTO(String name, String email, String mobile, int experience, ArrayList<String> skills, String location) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.experience = experience;
        this.skills = skills;
        this.location = location;
    }
}
