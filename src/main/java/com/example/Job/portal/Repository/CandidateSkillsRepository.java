package com.example.Job.portal.Repository;

import com.example.Job.portal.Entity.CandidateEntity;
import com.example.Job.portal.Entity.CandidateSkillsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;

@Repository
public interface CandidateSkillsRepository extends JpaRepository<CandidateSkillsEntity, Integer> {

    @Modifying
    @Query("DELETE from CandidateSkillsEntity WHERE candidateEntity = :candidate")
    void deleteByCandidateEntity(@Param("candidate") CandidateEntity candidate);
}
