package com.example.databaseservice.Controller;



import com.example.databaseservice.Repository.TruckRepository;

import com.example.databaseservice.model.TruckModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
public class TruckController {
    private TruckRepository repository;

    @Autowired
    public void setRepository(TruckRepository repository) {
        this.repository = repository;
    }

    @CrossOrigin
    @RequestMapping(
            value = "/AllTruck",
            method = RequestMethod.GET)
    public ResponseEntity<Collection<TruckModel>> getAllTrucks() {
        return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
    }

    @RequestMapping(
            value = "/truck/{id}",
            method = RequestMethod.GET)
    public TruckModel getTruckWithId(@PathVariable Long id) {
       TruckModel truckModel1 = repository.findById(id).get();
       return truckModel1;
    }

}
