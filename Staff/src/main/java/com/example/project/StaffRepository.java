package com.example.project;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer> {
	@Query("select c from Staff c where c.nom like :nom")
	public Page<Staff> staffByNom(@Param("nom") String n, Pageable pageable);
}
