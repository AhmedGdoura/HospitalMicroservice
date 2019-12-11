package com.project.planning.planning;

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
@RequestMapping("/planning")
public class PlanningController {


    @Autowired
    @Qualifier(value = "planningService")
    PlanningService planserv;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    /**
     * Method to fetch all users from the db.
     * @return
     */
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Collection<Planning> getAll() {
        System.out.println("-------> : getAllPlannings");
        logger.debug("Getting all plannings.");
        return planserv.getAllPlannings();
    }

    /**
     * Method to fetch user by id.
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Optional<Planning> getById(@PathVariable(value= "planning-id") int id) {
        logger.debug("Getting users with planning-id= {}.", id);
        return planserv.findPlanningById(id);
    }

    /**
     * Method to update user by id.
     * @param id
     * @param user
     * @return
     */
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String update(@PathVariable(value= "id") int id, @RequestBody Planning planning) {
        logger.debug("Updating planning with planning-id= {}.", id);
        planning.setId(id);
        planserv.updatePlanning(planning);
        return "user record for user-id= " + id + " updated.";
    }
    
    @PostMapping
	@ResponseStatus(HttpStatus.CREATED)
    public Planning createPlanning(@RequestBody Planning planning) {
        planserv.createPlanning(planning);
        return planning;
      }

    /**
     * Method to delete user by id.
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String delete(@PathVariable(value= "id") int id) {
        logger.debug("Deleting user with planning-id= {}.", id);
        planserv.deletePlanningById(id);
        return "planning record for planning-id= " + id + " deleted.";
    }

    /**
     * Method to delete all users from the db.
     * @return
     */
    @DeleteMapping(value= "/deleteall")
    public String deleteAll() {
        logger.debug("Deleting all plannings.");
        planserv.deleteAllPlannings();
        return "All plannings records deleted.";
    }
}
