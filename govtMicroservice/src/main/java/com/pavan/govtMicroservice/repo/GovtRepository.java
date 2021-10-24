package com.pavan.govtMicroservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pavan.govtMicroservice.model.Govt;

@Repository
public interface GovtRepository extends JpaRepository<Govt, String> {

}
