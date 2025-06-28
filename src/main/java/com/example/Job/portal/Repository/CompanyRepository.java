package com.example.Job.portal.Repository;

import com.example.Job.portal.Entity.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<CompanyEntity, Integer> {

    CompanyEntity findByCompanyName(String companyName);
}
