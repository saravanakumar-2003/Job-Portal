package com.example.Job.portal.Repository;

import com.example.Job.portal.Entity.JobEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<JobEntity, Integer> {
    JobEntity findByRole(String role);
}
