package com.example.microservices.devices;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


public class DeviceServiceImpl implements DeviceService {
	
	@Autowired
    DeviceDao devdao;

	@Override
	public void createDevice(Device device) {
		devdao.save(device);
		
	}

	@Override
	public Collection<Device> getAllDevices() {
        return devdao.findAll();
	}

	@Override
	public Optional<Device> findDeviceById(int _id) {
		return devdao.findById(_id);
	}

	@Override
	public void deleteDeviceById(int _id) {
		devdao.deleteById(_id);
		
	}

	@Override
	public void updateDevice(Device device) {
		devdao.save(device);
		
	}

	@Override
	public void deleteAllDevices() {
		devdao.deleteAll();
		
	}

}
