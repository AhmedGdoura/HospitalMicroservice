package com.example.microservices.devices;
import java.util.Collection;
import java.util.Optional;


public interface DeviceService {
	
	public void createDevice(Device device);


    public Collection<Device> getAllDevices();


    public Optional<Device> findDeviceById(int _id);


    public void deleteDeviceById(int _id);


    public void updateDevice(Device device);


    public void deleteAllDevices();

}

