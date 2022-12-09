package com.formacion.cursoOracle;

public class Clothing implements Comparable<Clothing> {

	private String description;
	private double price;
	private String size = "M";

	public final static double MIN_VALUE = 10.0;
	public final static double MIN_TAX = 0.2;

	public Clothing(String description, double price, String aSize) {
		this.description = description;
		this.price = price;
		size = aSize;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price + (price * MIN_TAX);
	}

	public void setPrice(double price) {
		if (price < MIN_VALUE) {
			this.price = MIN_VALUE;
		} else {
			this.price = price;
		}
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return description + ", " + price + ", " + size;
	}

	@Override
	public int compareTo(Clothing c) {
		return this.description.compareTo(c.description);
	}

}
