package com.example.microservices.rendezvous;

import java.util.Collection;
import java.util.Optional;


public interface RendezVousService {
	
	public void createRendezVous(RendezVous rendezvous);


    public Collection<RendezVous> getAllRendezVous();


    public Optional<RendezVous> findRendezVousById(int _id);


    public void deleteRendezVousById(int _id);


    public void updateRendezVous(RendezVous rendezvous);


    public void deleteAllRendezVous();

}

