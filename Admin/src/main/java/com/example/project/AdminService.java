package com.example.project;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepository adminRepository;
	public Collection<Admin> getAllAdmin() {
        return adminRepository.findAll();
	}
	public Admin addAdmin (Admin admin) {
		return adminRepository.save(admin);
	}
	public Admin updateAdmin(int id, Admin adminnew) {
		if (adminRepository.findById(id).isPresent()) {
			Admin existingAdmin = adminRepository.findById(id).get();
			existingAdmin.setNom (adminnew.getNom());
			existingAdmin.setPrenom (adminnew.getPrenom());
			existingAdmin.setEmail (adminnew.getEmail());
			existingAdmin.setGrade (adminnew.getGrade());
			existingAdmin.setAdresse (adminnew.getAdresse());
			existingAdmin.setSituation (adminnew.getSituation());
			existingAdmin.setDateNaissance (adminnew.getDateNaissance());
			existingAdmin.setDateEmbauchement (adminnew.getDateEmbauchement());
			existingAdmin.setSalaire (adminnew.getSalaire());
			existingAdmin.setTelephone (adminnew.getTelephone());
			existingAdmin.setNbenfant (adminnew.getNbenfant());
			return adminRepository.save(existingAdmin);
		} else 
			return null;
	}
	public String deleteAdmin(int id) {
		if (adminRepository.findById(id).isPresent()) {
			adminRepository.deleteById(id);
			return "admin supprimé";
		}else 
			return "admin non supprimé";
	}
}
