package com.microservice.soa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class MedicalService {
	@Autowired
	private MedicalRepository medicalRepository;
	
	public Medical addMedical(Medical medical) {
		return medicalRepository.save(medical);
	}
	public Medical updateMedical(int id, Medical newMedical) {
		if(medicalRepository.findById(id).isPresent()) {
			Medical existingMedical = medicalRepository.findById(id).get();
			existingMedical.setName(newMedical.getName());
			existingMedical.setLastname(newMedical.getLastname());
			existingMedical.setTraitement(newMedical.getTraitement());
			existingMedical.setMaladi(newMedical.getMaladi());
			existingMedical.setMedicament(newMedical.getMedicament());

			return medicalRepository.save(existingMedical);
		} else
			return null;
	}
	
	public String deleteMedical(int id) {
		if(medicalRepository.findById(id).isPresent()) {
			medicalRepository.deleteById(id);
			return "Provider Deleted";
		} else
			return "Provider not Deleted";
	}


}
