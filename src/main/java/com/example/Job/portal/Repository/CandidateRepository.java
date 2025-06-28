package com.example.Job.portal.Repository;

import com.example.Job.portal.Entity.CandidateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface CandidateRepository extends JpaRepository<CandidateEntity, Integer> {
    CandidateEntity findByEmail(String email);

    @Modifying
    @Query("UPDATE CandidateEntity ce SET ce.skills = :skills WHERE ce.email = :email")
    void updateSkills(@Param("email") String email,@Param("skills") ArrayList<String> skills);

}
