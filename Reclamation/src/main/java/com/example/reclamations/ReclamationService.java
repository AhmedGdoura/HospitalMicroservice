package com.example.reclamations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReclamationService {
	@Autowired
	private ReclamationRepository reclamationRepository;
	
	public Reclamation addReclamation(Reclamation reclamation) {
		return reclamationRepository.save(reclamation);
	}
	public Reclamation updateReclamation(int id, Reclamation newReclamation) {
		if(reclamationRepository.findById(id).isPresent()) {
			Reclamation existingReclamation = reclamationRepository.findById(id).get();
			existingReclamation.setDesc(newReclamation.getDesc());
			existingReclamation.setEmail(newReclamation.getEmail());
			return reclamationRepository.save(existingReclamation);
		} else
			return null;
	}
	
	public String deleteReclamation(int id) {
		if(reclamationRepository.findById(id).isPresent()) {
			reclamationRepository.deleteById(id);
			return "Patient deleted";
		} else
			return "Patient not deleted";
	}

}
