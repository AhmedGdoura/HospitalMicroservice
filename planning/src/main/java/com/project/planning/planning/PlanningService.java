package com.project.planning.planning;

import java.util.Collection;
import java.util.Optional;


public interface PlanningService {
	
	public void createPlanning(Planning planning);


    public Collection<Planning> getAllPlannings();


    public Optional<Planning> findPlanningById(int _id);


    public void deletePlanningById(int _id);


    public void updatePlanning(Planning planning);


    public void deleteAllPlannings();

}
