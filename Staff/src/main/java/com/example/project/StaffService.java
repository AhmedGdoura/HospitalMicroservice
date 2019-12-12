package com.example.project;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffService {
	
	@Autowired
	private StaffRepository staffRepository;
	public Collection<Staff> getAllStaff() {
        return staffRepository.findAll();
	}
	public Staff addStaff (Staff staff) {
		return staffRepository.save(staff);
	}
	public Staff updateStaff(int id, Staff staffnew) {
		if (staffRepository.findById(id).isPresent()) {
			Staff existingStaff = staffRepository.findById(id).get();
			existingStaff.setNom (staffnew.getNom());
			existingStaff.setPrenom (staffnew.getPrenom());
			existingStaff.setEmail (staffnew.getEmail());
			existingStaff.setMetier (staffnew.getMetier());
			existingStaff.setAdresse (staffnew.getAdresse());
			existingStaff.setSituation (staffnew.getSituation());
			existingStaff.setDateNaissance (staffnew.getDateNaissance());
			existingStaff.setDateEmbauchement (staffnew.getDateEmbauchement());
			existingStaff.setSalaire (staffnew.getSalaire());
			existingStaff.setTelephone (staffnew.getTelephone());
			existingStaff.setNbenfant (staffnew.getNbenfant());
			return staffRepository.save(existingStaff);
		} else 
			return null;
	}
	public String deleteStaff(int id) {
		if (staffRepository.findById(id).isPresent()) {
			staffRepository.deleteById(id);
			return "staff supprimé";
		}else 
			return "staff non supprimé";
	}
}
