package com.formacion.cursoOracle;

import java.util.Arrays;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShopApp {

	public static void main(String[] args) {

		System.out.println("Welcome to Duke Choice Shop!");

		Customer c1 = new Customer("Pinky", 3);
		// c1.setName("Pinky");
		// c1.setSize("S");

		System.out.println("Precion min.: " + Clothing.MIN_VALUE);

		Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
		Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");
		Clothing[] items = { item1, item2, new Clothing("Green scarf", 5, "S"),
				new Clothing("Blue T-Shirt", 10.5, "S") };
		/*
		 * item1.setDescription(); item1.setPrice();
		 * 
		 * item2.setDescription(); item2.setPrice(10.5); item2.setSize("S");
		 * 
		 * items[2].setDescription(); items[2].setPrice(5); items[2].setSize("S");
		 * 
		 * items[3].setDescription(); items[3].setPrice(10.5); items[3].setSize("S");
		 *
		 * total = ((item2.price * 2) + item1.price); total = total + (total * tax);
		 * 
		 */

		// int messurement = 3;

		c1.addItems(items);

		/*
		 * System.out.println(item1.toString()); System.out.println(item2.toString());
		 */

		System.out.println("Customer: " + c1.getName() + ", " + c1.getSize() + ", " + c1.getTotalClothingCost());

		for (Clothing cloth : c1.getItems()) {
			System.out.println("Items listados: " + cloth.toString());
		}

		int average = 0;
		int count = 0;

		for (Clothing cloth : c1.getItems()) {
			// System.out.println("Items " + cloth.getDescription());
			if (cloth.getSize().equals("L")) {
				count++;
				average += cloth.getPrice();
			}

		}
		try {
			average = (count == 0) ? 0 : average / count;
			average = average / count;
			System.out.println("Precio promedio: " + average + " contando " + count);
		} catch (ArithmeticException e) {
			System.out.println("Nro. de elementos minimo igual a 0");
		}

		Arrays.sort(c1.getItems());

		for (Clothing cloth : c1.getItems()) {
			System.out.println("Salida: " + cloth);
		}

	}
}