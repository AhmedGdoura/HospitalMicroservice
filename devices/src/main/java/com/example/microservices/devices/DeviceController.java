package com.example.microservices.devices;

import java.util.Collection;
import java.util.Optional;

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
@RequestMapping("/devices")
public class DeviceController {


    @Autowired
    @Qualifier(value = "deviceService")
    DeviceService devserv;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    /**
     * Method to fetch all users from the db.
     * @return
     */
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Collection<Device> getAll() {
        System.out.println("-------> : getAllRendezVous");
        logger.debug("Getting all plannings.");
        return devserv.getAllDevices();
    }

    /**
     * Method to fetch user by id.
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Optional<Device> getById(@PathVariable(value= "id") int id) {
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
    public String update(@PathVariable(value= "id") int id, @RequestBody Device device) {
        device.setNumSerie(id);
        devserv.updateDevice(device);
        return "Device with NumSerie= " + id + " updated.";
    }
    
    @PostMapping
	@ResponseStatus(HttpStatus.CREATED)
    public Device createDevice(@RequestBody Device device) {
        devserv.createDevice(device);
        return device;
      }

    /**
     * Method to delete user by id.
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String delete(@PathVariable(value= "id") int id) {
       devserv.deleteDeviceById(id);
        return "Device with NumSerie " + id + " deleted.";
    }

    /**
     * Method to delete all users from the db.
     * @return
     */
    @DeleteMapping(value= "/deleteall")
    public String deleteAll() {
        logger.debug("Deleting all plannings.");
        devserv.deleteAllDevices();
        return "All Devices records deleted.";
    }
}
