package com.example.Commandes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CommandeService {
	@Autowired
	private CommandeRepository commandeRepository;
	
	public Commande addCommande(Commande commande) {
		return commandeRepository.save(commande);
	}
	public Commande updateCommande(int id, Commande newCommande) {
		if(commandeRepository.findById(id).isPresent()) {
			Commande existingCommande = commandeRepository.findById(id).get();
			existingCommande.setIdM(newCommande.getIdM());
			existingCommande.setDesc(newCommande.getDesc());
			existingCommande.setTotalprice(newCommande.getTotalprice());
			existingCommande.setTotalQty(newCommande.getTotalQty());
			return commandeRepository.save(existingCommande);
		} else
			return null;
	}
	
	public String deleteCommande(int id) {
		if(commandeRepository.findById(id).isPresent()) {
			commandeRepository.deleteById(id);
			return "Commande deleted";
		} else
			return "Commande not deleted";
	}

}
