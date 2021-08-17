package com.yalda.WeddingAppSpringboot.dao;

import com.yalda.WeddingAppSpringboot.model.DrinkPackages;
import java.util.List;

public interface PackagesDAO {

    int insertPackages(DrinkPackages dPackages);

    List<DrinkPackages> getAllPackages();
}
