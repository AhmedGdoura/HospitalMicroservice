package com.project.planning.planning;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

public class PlanningServiceImpl implements PlanningService {
	
    @Autowired
    PlanningDao planningdao;

	@Override
	public void createPlanning(Planning planning) {
		planningdao.save(planning);
		
	}

	@Override
	public Collection<Planning> getAllPlannings() {
        return planningdao.findAll();
	}

	@Override
	public Optional<Planning> findPlanningById(int _id) {
		return planningdao.findById(_id);
	}

	@Override
	public void deletePlanningById(int _id) {
		planningdao.deleteById(_id);
		
	}

	@Override
	public void updatePlanning(Planning planning) {
		planningdao.save(planning);
		
	}

	@Override
	public void deleteAllPlannings() {
		planningdao.deleteAll();
		
	}

}
