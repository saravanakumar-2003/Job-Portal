package com.example.Job.portal.Repository;

import com.example.Job.portal.Entity.SkillsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepository extends JpaRepository<SkillsEntity, Integer> {
    SkillsEntity findBySkill(String skill);
}
