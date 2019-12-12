package com.example.providers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProviderService {
	@Autowired
	private ProviderRepository providerRepository;
	
	public Provider addProvider(Provider provider) {
		return providerRepository.save(provider);
	}
	public Provider updateProvider(int id, Provider newProvider) {
		if(providerRepository.findById(id).isPresent()) {
			Provider existingProvider = providerRepository.findById(id).get();
			existingProvider.setName(newProvider.getName());
			existingProvider.setEmail(newProvider.getEmail());
			existingProvider.setNum(newProvider.getNum());
			return providerRepository.save(existingProvider);
		} else
			return null;
	}
	
	public String deleteProvider(int id) {
		if(providerRepository.findById(id).isPresent()) {
			providerRepository.deleteById(id);
			return "Provider Deleted";
		} else
			return "Provider not Deleted";
	}


}
