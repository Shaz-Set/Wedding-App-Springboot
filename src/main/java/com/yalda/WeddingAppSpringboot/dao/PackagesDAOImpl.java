package com.yalda.WeddingAppSpringboot.dao;

import com.yalda.WeddingAppSpringboot.model.DrinkPackages;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PackagesDAOImpl implements PackagesDAO {
    List<DrinkPackages> drinkPackage = new ArrayList<>();

    @Override
    public int insertPackages(DrinkPackages dPackages) {
        drinkPackage.add(dPackages);
        return 1;
    }
}
