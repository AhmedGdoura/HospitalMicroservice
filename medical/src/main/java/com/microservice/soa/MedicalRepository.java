package com.microservice.soa;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface MedicalRepository extends JpaRepository<Medical, Integer>{
	@Query("select p from Medical p where p.name like :name")
	public Page<Medical> medicalByNom(@Param("name") String n, Pageable pageable);
}
