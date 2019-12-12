package com.example.microservices.rendezvous;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RendezVousDao extends MongoRepository<RendezVous, Integer>{

}
