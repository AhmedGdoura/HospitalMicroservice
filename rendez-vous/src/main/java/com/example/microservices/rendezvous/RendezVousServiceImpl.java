package com.example.microservices.rendezvous;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


public class RendezVousServiceImpl implements RendezVousService {
	
	@Autowired
    RendezVousDao rvdao;

	@Override
	public void createRendezVous(RendezVous rendezvous) {
		rvdao.save(rendezvous);
		
	}

	@Override
	public Collection<RendezVous> getAllRendezVous() {
        return rvdao.findAll();
	}

	@Override
	public Optional<RendezVous> findRendezVousById(int _id) {
		return rvdao.findById(_id);
	}

	@Override
	public void deleteRendezVousById(int _id) {
		rvdao.deleteById(_id);
		
	}

	@Override
	public void updateRendezVous(RendezVous rendezvous) {
		rvdao.save(rendezvous);
		
	}

	@Override
	public void deleteAllRendezVous() {
		rvdao.deleteAll();
		
	}

}
