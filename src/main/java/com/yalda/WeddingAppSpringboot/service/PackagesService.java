package com.yalda.WeddingAppSpringboot.service;

import com.yalda.WeddingAppSpringboot.dao.PackagesDAO;
import com.yalda.WeddingAppSpringboot.model.DrinkPackages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PackagesService {
    @Autowired
    private PackagesDAO dPackagesDAO;

    public int insertPackages(DrinkPackages dPackages){
        return dPackagesDAO.insertPackages(dPackages);
    }

    public List<DrinkPackages> getAllPackages(){
        return dPackagesDAO.getAllPackages();
    }
}
