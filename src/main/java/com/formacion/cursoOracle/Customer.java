package com.formacion.cursoOracle;

public class Customer {

	private String name;
	private String size;

	private Clothing[] items;

	public Customer(String name, int meassurment) {
		this.name = name;
		setSize(meassurment);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public void setSize(int meassurment) {
		switch (meassurment) {
		case 1:
		case 2:
		case 3:
			setSize("S");
			break;
		case 4:
		case 5:
		case 6:
			setSize("M");
			break;
		case 7:
		case 8:
		case 9:
			setSize("L");
			break;

		default:
			setSize("XL");
		}
	}

	public void addItems(Clothing[] someItems) {
		items = someItems;
	}

	public Clothing[] getItems() {
		return items;
	}

	public double getTotalClothingCost() {

		double totalCost = 0.0;
		for (Clothing cloth : items) {
			// if (c1.getSize().equals(cloth.getSize())) {
			totalCost = totalCost + cloth.getPrice();
			// System.out.println(cloth.toString());
			// totalCost = totalCost + totalCost * tax;
			/*
			 * if (totalCost > 15) { break; }
			 */

		}
		return totalCost;
	}
}
