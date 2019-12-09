package com.example.medicaments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicamentService {
	@Autowired
	private MedicamentRepository medicamentRepository;
	
	public Medicament addMedicament(Medicament medicament) {
		return medicamentRepository.save(medicament);
	}
	public Medicament updateMedicament(int id, Medicament newMedicament) {
		if(medicamentRepository.findById(id).isPresent()) {
			Medicament existingMedicament = medicamentRepository.findById(id).get();
			existingMedicament.setName(newMedicament.getName());
			existingMedicament.setDescription(newMedicament.getDescription());
			existingMedicament.setPrice(newMedicament.getPrice());
			existingMedicament.setQty(newMedicament.getQty());
			return medicamentRepository.save(existingMedicament);
		} else
			return null;
	}
	
	public String deleteMedicament(int id) {
		if(medicamentRepository.findById(id).isPresent()) {
			medicamentRepository.deleteById(id);
			return "Drugs deleted";
		} else
			return "Drugs not deleted";
	}

}
