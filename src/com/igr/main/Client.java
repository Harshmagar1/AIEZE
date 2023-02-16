package com.igr.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.igr.bean.Dish;
import com.igr.bean.Location;
import com.igr.itr.DominozPizzaDeliveryIgr;
import com.igr.itr.DominozPizzaIgr;

public class Client {

	public static void combination() {
		List<Dish> list = new ArrayList<Dish>();
		Set<Location> set = new HashSet<Location>();

		DominozPizzaIgr dm = new DominozPizzaDeliveryIgr();
		dm.populateData("dish.txt", "location.txt", list, set);

		System.out.println("\t" + "Please Select From Following Dish" + "\t");

		for (Dish dish : list) {

			System.out.print(dish.getIndex() + "\t ");
			System.out.print(" " + dish.getDishName() + "\t");
			System.out.println(dish.getDishPrice());
		}

		Scanner sca = new Scanner(System.in);
		System.out.println("\n");
		System.out.println("\t" + "Enter The Choise" + "\t");
		Dish d = new Dish();
		Program p = new Program();
		d.setChoise(sca.nextInt());
		if (d.getChoise() > 0 && d.getChoise() < 8) {

			switch (d.getChoise()) {
			case 1:
				System.out.println(list.get(0));
				p.printLocation(list, set);
				p.calculate(set, list);

				break;
			case 2:
				System.out.println(list.get(1));
				p.printLocation(list, set);
				p.calculate(set, list);
				break;
			case 3:
				System.out.println(list.get(2));
				p.printLocation(list, set);

				p.calculate(set, list);
			case 4:
				System.out.println(list.get(3));
				p.printLocation(list, set);
				p.calculate(set, list);
				break;
			case 5:
				System.out.println(list.get(4));
				p.printLocation(list, set); 
				p.calculate(set, list);
				break;
			case 6:
				System.out.println(list.get(5));
				p.printLocation(list, set);
				p.calculate(set, list);
				break;
			case 7:
				System.out.println(list.get(6));
				p.printLocation(list, set);
				p.calculate(set, list);

				break;

			}
		}else {
			System.out.println("enter valid number");
			Client.combination();
		}

	}

	public static void main(String[] args) {
		System.out.println("\t" + " WEL-COME TO DOMINOZ PIZA" + "\t");
		System.out.println("\n");
		Client.combination();

	}

	public static void menudriven() {

		System.out.println("***************************************");
		System.out.println("1.want to select another dish");
		System.out.println("0.exit");
		System.out.println("please enter number");
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		if (b == 1) {
			Client.combination();
		} else if (b != 0 && b != 1) {
			System.out.println("please enter valid number....");
			menudriven();
		} else {
			System.out.println("Thank you visit again....");
		}

	}

}
