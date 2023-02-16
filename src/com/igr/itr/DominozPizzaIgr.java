package com.igr.itr;

import java.util.List;
import java.util.Set;

import com.igr.bean.Dish;
import com.igr.bean.Location;

public interface DominozPizzaIgr {

	void populateData(String DishFile, String locationFile, List<Dish> dishs,Set<Location> locations);

}
