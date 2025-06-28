package com.example.Job.portal.Repository;

import com.example.Job.portal.Entity.RecruiterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecruiterRepository extends JpaRepository<RecruiterEntity, Integer> {
}
