package com.example.microservices.DeviceMeasurments;

import java.util.Collection;
import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/deviceMeasurments")
public class DeviceMeasurmentsController {


    @Autowired
    @Qualifier(value = "deviceMeasumentsService")
    DeviceMeasurmentsService devserv;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    /**
     * Method to fetch all users from the db.
     * @return
     */
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Collection<DeviceMeasurments> getAll() {
        System.out.println("-------> : getAllRendezVous");
        logger.debug("Getting all plannings.");
        return devserv.getAllDevicesMeasurments();
    }

    /**
     * Method to fetch user by id.
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public List<DeviceMeasurments> getById(@PathVariable(value= "id") int id) {
        return devserv.findDeviceById(id);
    }

    /**
     * Method to update user by id.
     * @param id
     * @param user
     * @return
     */
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String update(@PathVariable(value= "id") int id, @RequestBody DeviceMeasurments deviceMeasurment) {
        deviceMeasurment.setId(id);
        devserv.updateDeviceMeasurments(deviceMeasurment);
        return "Device with NumSerie= " + id + " updated.";
    }
    
    @PostMapping
	@ResponseStatus(HttpStatus.CREATED)
    public DeviceMeasurments createDeviceMeasurments(@RequestBody DeviceMeasurments deviceMeasurment) {
        devserv.createDeviceMeasurments(deviceMeasurment);
        return deviceMeasurment;
      }

    /**
     * Method to delete user by id.
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String delete(@PathVariable(value= "id") int id) {
       devserv.deleteDeviceMeasurmentsById(id);
        return "Device with NumSerie " + id + " deleted.";
    }

    /**
     * Method to delete all users from the db.
     * @return
     */
    @DeleteMapping(value= "/deleteall")
    public String deleteAll() {
        logger.debug("Deleting all plannings.");
        devserv.deleteAllDevicesMeasurments();
        return "All Devices records deleted.";
    }
}
