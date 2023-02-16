package com.igr.bean;

public class Dish {

	public int index;
	private int dishId;
	public String dishName;
	private double dishPrice;
	private double cookTime;
	
	private static int choise;
	private static int no;

	public Dish() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dish(int index, int dishId, String dishName, double dishPrice, double cookTime) {
		super();
		this.index = index;
		this.dishId = dishId;
		this.dishName = dishName;
		this.dishPrice = dishPrice;
		this.cookTime = cookTime;
	}

	@Override
	public String toString() {
		return "[" + index + "," + dishId + "," + dishName + "," + dishPrice + "," + cookTime + "]";
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public int getDishId() {
		return dishId;
	}

	public void setDishId(int dishId) {
		this.dishId = dishId;
	}

	public double getDishPrice() {
		return dishPrice;
	}

	public void setDishPrice(double dishPrice) {
		this.dishPrice = dishPrice;
	}

	public double getCookTime() {
		return cookTime;
	}

	public void setCookTime(double cookTime) {
		this.cookTime = cookTime;
	}

	public int getChoise() {
		return choise;
	}

	public void setChoise(int choise) {
		this.choise = choise;
	}

	public static int getNo() {
		return no;
	}

	public static void setNo(int no) {
		Dish.no = no;
	}

}
