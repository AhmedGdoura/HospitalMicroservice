package com.example.microservices.DeviceMeasurments;

import java.util.Collection;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


public class DeviceMeasurmentsServiceImpl implements DeviceMeasurmentsService {
	
	@Autowired
    DeviceMeasurmentsDao devdao;

	@Override
	public void createDeviceMeasurments(DeviceMeasurments deviceMeasurment) {
		devdao.save(deviceMeasurment);
		
	}

	@Override
	public Collection<DeviceMeasurments> getAllDevicesMeasurments() {
        return devdao.findAll();
	}

	@Override
	public List<DeviceMeasurments> findDeviceById(int _id) {
		return devdao.findDeviceByidPatient(_id);
	}

	@Override
	public void deleteDeviceMeasurmentsById(int _id) {
		devdao.deleteById(_id);
		
	}

	@Override
	public void updateDeviceMeasurments(DeviceMeasurments device) {
		devdao.save(device);
		
	}

	@Override
	public void deleteAllDevicesMeasurments() {
		devdao.deleteAll();
		
	}

}
