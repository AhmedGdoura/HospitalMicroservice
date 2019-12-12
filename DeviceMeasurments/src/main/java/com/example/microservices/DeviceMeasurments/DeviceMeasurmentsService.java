package com.example.microservices.DeviceMeasurments;
import java.util.Collection;
import java.util.List;



public interface DeviceMeasurmentsService {
	
	public void createDeviceMeasurments(DeviceMeasurments deviceMeasurments);


    public Collection<DeviceMeasurments> getAllDevicesMeasurments();


    public List<DeviceMeasurments> findDeviceById(int _id);


    public void deleteDeviceMeasurmentsById(int _id);


    public void updateDeviceMeasurments(DeviceMeasurments device);


    public void deleteAllDevicesMeasurments();

}