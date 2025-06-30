package com.example.Job.portal.Repository;

import com.example.Job.portal.Entity.JobEntity;
import com.example.Job.portal.Entity.JobSkillsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface JobSkillsRepository extends JpaRepository<JobSkillsEntity, Integer> {
    ArrayList<JobSkillsEntity> findAllByJobEntity(JobEntity byRole);
}
