package com.example.Commandes;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CommandeRepository extends JpaRepository<Commande,Integer>{
	@Query("select c from Commande c where c.name like :name")
	public Page<Commande> commandeByName(@Param("name") String n, Pageable pageable);

}
