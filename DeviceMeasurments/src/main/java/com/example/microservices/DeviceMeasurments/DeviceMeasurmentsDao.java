package com.example.microservices.DeviceMeasurments;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceMeasurmentsDao extends MongoRepository<DeviceMeasurments, Integer>{
	public List<DeviceMeasurments> findDeviceByidPatient(int idPatient);

}