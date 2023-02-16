package com.igr.itr;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.igr.bean.Dish;
import com.igr.bean.Location;

public class DominozPizzaDeliveryIgr implements DominozPizzaIgr {

	@Override
	public void populateData(String DishFile, String locationFile, List<Dish> dishs,Set<Location> locations) {
		Scanner sc = null;
		try {
			sc = new Scanner(new File(DishFile));
			while (sc.hasNext()) {
				String t[] = sc.nextLine().split(",");
				int index = Integer.parseInt(t[0].trim());
				int dishId = Integer.parseInt(t[1].trim());
				String dishName = t[2].trim();
				double dishPrice = Double.parseDouble(t[3].trim());
				double cookTime = Double.parseDouble(t[4].trim());
				Dish d = new Dish(index, dishId, dishName, dishPrice, cookTime);
				dishs.add(d);

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			sc.close();
		}
		
		try {
			sc = new Scanner(new File(locationFile));
			while (sc.hasNext()) {
				String t[] = sc.nextLine().split(",");
				int index = Integer.parseInt(t[0].trim());
				String locName = t[1].trim();
				int locId = Integer.parseInt(t[2].trim());
				int locDist = Integer.parseInt(t[3].trim());
				double locTime = Double.parseDouble(t[4].trim());
				
				Location loc = new Location(index, locName, locId, locDist, locTime);
				locations.add(loc);

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			sc.close();
		}
		
		
	}
	

}
