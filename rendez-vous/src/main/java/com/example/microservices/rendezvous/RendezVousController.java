package com.example.microservices.rendezvous;
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
@RequestMapping("/rendez_vous")
public class RendezVousController {


    @Autowired
    @Qualifier(value = "rendezvousService")
    RendezVousService rvserv;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    /**
     * Method to fetch all users from the db.
     * @return
     */
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Collection<RendezVous> getAll() {
        System.out.println("-------> : getAllRendezVous");
        logger.debug("Getting all plannings.");
        return rvserv.getAllRendezVous();
    }

    /**
     * Method to fetch user by id.
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Optional<RendezVous> getById(@PathVariable(value= "id") int id) {
        return rvserv.findRendezVousById(id);
    }

    /**
     * Method to update user by id.
     * @param id
     * @param user
     * @return
     */
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String update(@PathVariable(value= "id") int id, @RequestBody RendezVous rendezvous) {
        rendezvous.set_id(id);
        rvserv.updateRendezVous(rendezvous);
        return "Rendez vous with _id= " + id + " updated.";
    }
    
    @PostMapping
	@ResponseStatus(HttpStatus.CREATED)
    public RendezVous createRendezVous(@RequestBody RendezVous rendezvous) {
        rvserv.createRendezVous(rendezvous);
        return rendezvous;
      }

    /**
     * Method to delete user by id.
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String delete(@PathVariable(value= "id") int id) {
       rvserv.deleteRendezVousById(id);
        return "Rendez vous with _id= " + id + " deleted.";
    }

    /**
     * Method to delete all users from the db.
     * @return
     */
    @DeleteMapping(value= "/deleteall")
    public String deleteAll() {
        logger.debug("Deleting all plannings.");
        rvserv.deleteAllRendezVous();
        return "All Rendez vous records deleted.";
    }
}
