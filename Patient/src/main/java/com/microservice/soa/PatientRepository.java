package com.microservice.soa;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface PatientRepository extends JpaRepository<Patient,Integer>{
	@Query("select m from Patient m where m.name like :name")
	public Page<Patient> patientByName(@Param("name") String n, Pageable pageable);

}
