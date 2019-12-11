package com.project.planning.planning;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanningDao extends MongoRepository<Planning, Integer>{

}
