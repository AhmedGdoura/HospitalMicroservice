package com.example.providers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProviderRepository extends JpaRepository<Provider, Integer>{
	@Query("select p from Provider p where p.name like :name")
	public Page<Provider> providerByNom(@Param("name") String n, Pageable pageable);
}
