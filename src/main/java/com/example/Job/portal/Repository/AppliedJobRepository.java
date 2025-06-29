package com.example.Job.portal.Repository;

import com.example.Job.portal.Entity.AppliedJobsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppliedJobRepository extends JpaRepository<AppliedJobsEntity, Integer> {
}
