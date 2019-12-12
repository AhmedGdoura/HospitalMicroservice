package com.example.microservices.devices;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceDao extends MongoRepository<Device, Integer>{

}

