package com.yalda.WeddingAppSpringboot.controller;

import com.yalda.WeddingAppSpringboot.model.DrinkPackages;
import com.yalda.WeddingAppSpringboot.service.PackagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/packages")
public class PackagesController {

    @Autowired
    private PackagesService packagesService;

    @PostMapping
    public void insertStudent(@RequestBody DrinkPackages dPackage){
        packagesService.insertPackages(dPackage);
    }
}


//GET - getting data from DB
//POST - inserting new data into DB
//PUT - updating existing data
//DELETE - deleting data from DB