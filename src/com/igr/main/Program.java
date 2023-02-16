package com.igr.main;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.igr.bean.Dish;
import com.igr.bean.Location;

public class Program {

	public void printLocation(List<Dish> dishs, Set<Location> locations) {
		Dish d = new Dish();
		Location l = new Location();
		for (Dish m : dishs) {
			if (d.getChoise() == m.getIndex()) {
				for (Location n : locations) {
					if ((m.getCookTime() + n.getLocTime()) <= 30) {
						System.out.println(n.getIndex() + " " + n.getLocName());

					}

				}
			}
		}

	}

	public void calculate(Set<Location> locations, List<Dish> dishs) {
		Dish d = new Dish();
		Location l = new Location();
		Scanner sc = new Scanner(System.in);
		System.out.println("\n");
		System.out.println("\t"+"Please Select The Location Index->"+"\t");
		d.setNo(sc.nextInt());

		for (Dish m : dishs) {
			if (d.getChoise() == m.getIndex()) {
				for (Location n : locations) {
					if (d.getNo() == n.getIndex()) {
						if (m.getDishPrice()>200 &&n.getLocDist()<10) {
							System.out.println("Dish Name     :- "+m.getDishName());
							System.out.println("Dish Price    :-"+m.getDishPrice());
							System.out.println("Location Dist :- "+n.getLocDist()+"km");
							System.out.println("Congratulation..!! No Delivery Charge");
							System.out.println(m.getDishPrice());
							 
						}else {
							System.out.println("Dish Name     :- "+m.getDishName());
							System.out.println("Dish Price    :-"+m.getDishPrice());
							System.out.println("Location Dist :- "+n.getLocDist()+"km");
							System.out.println("Total Charge...");
							System.out.println(m.getDishPrice()+n.getLocDist());
						}

					}

				}

			}

		}
		Client.menudriven();

	}
	
}
