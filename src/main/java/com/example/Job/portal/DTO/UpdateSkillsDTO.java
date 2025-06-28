package com.example.Job.portal.DTO;

import java.util.ArrayList;

public class UpdateSkillsDTO {

    private String email;
    private ArrayList<String> skills;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }

    public UpdateSkillsDTO() {
    }

    public UpdateSkillsDTO(String email, ArrayList<String> skills) {
        this.email = email;
        this.skills = skills;
    }
}
