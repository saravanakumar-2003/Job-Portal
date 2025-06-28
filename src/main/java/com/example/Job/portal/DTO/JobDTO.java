package com.example.Job.portal.DTO;

import java.util.ArrayList;

public class JobDTO {

    private String role;
    private ArrayList<String> skills;
    private ArrayList<String> locations;
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

    public ArrayList<String> getLocations() {
        return locations;
    }

    public void setLocations(ArrayList<String> locations) {
        this.locations = locations;
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

    public JobDTO(String role, ArrayList<String> skills, ArrayList<String> locations, int experience, String recruiterEmail) {
        this.role = role;
        this.skills = skills;
        this.locations = locations;
        this.experience = experience;
        this.recruiterEmail = recruiterEmail;
    }
}
