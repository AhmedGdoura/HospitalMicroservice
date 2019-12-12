package com.microservice.soa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PatientService {
	@Autowired
	private PatientRepository patientRepository;
	
	public Patient addPatient(Patient patient) {
		return patientRepository.save(patient);
	}
	public Patient updatePatient(int id, Patient newPatient) {
		if(patientRepository.findById(id).isPresent()) {
			Patient existingPatient = patientRepository.findById(id).get();
			existingPatient.setName(newPatient.getName());
			existingPatient.setLastname(newPatient.getLastname());
			existingPatient.setNumero(newPatient.getNumero());
			existingPatient.setEmail(newPatient.getEmail());
			return patientRepository.save(existingPatient);
		} else
			return null;
	}
	
	public String deletePatient(int id) {
		if(patientRepository.findById(id).isPresent()) {
			patientRepository.deleteById(id);
			return "Patient deleted";
		} else
			return "Patient not deleted";
	}

}
