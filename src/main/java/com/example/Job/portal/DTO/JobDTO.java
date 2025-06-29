package com.example.Job.portal.DTO;

import java.util.ArrayList;

public class JobDTO {

    private String role;
    private ArrayList<String> skills;
    private String location;
    private int experience;
    private String recruiterEmail;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getRecruiterEmail() {
        return recruiterEmail;
    }

    public void setRecruiterEmail(String recruiterEmail) {
        this.recruiterEmail = recruiterEmail;
    }

    public JobDTO() {
    }

    public JobDTO(String role, ArrayList<String> skills, String location, int experience, String recruiterEmail) {
        this.role = role;
        this.skills = skills;
        this.location = location;
        this.experience = experience;
        this.recruiterEmail = recruiterEmail;
    }
}
