package com.example.medicaments;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MedicamentRepository extends JpaRepository<Medicament,Integer> {
	@Query("select m from Medicament m where m.name like :name")
	public Page<Medicament> medicamentByName(@Param("name") String n, Pageable pageable);
}
