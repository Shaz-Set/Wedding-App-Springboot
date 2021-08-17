package com.yalda.WeddingAppSpringboot.controller;

import com.yalda.WeddingAppSpringboot.model.DrinkPackages;
import com.yalda.WeddingAppSpringboot.service.PackagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("api/packages")
public class PackagesController {

    @Autowired
    private PackagesService packagesService;

    @PostMapping
    public void insertStudent(@RequestBody DrinkPackages dPackage){
        packagesService.insertPackages(dPackage);
    }

    @GetMapping
    public List<DrinkPackages> getAllPackages() {
        return packagesService.getAllPackages();
    }
}


//GET - getting data from DB
//POST - inserting new data into DB
//PUT - updating existing data
//DELETE - deleting data from DB