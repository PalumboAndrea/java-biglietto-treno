package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Quanti chilometri vuoi fare?");
		int userKm = in.nextInt();
		
		System.out.println("Quanti anni hai?");
		int userAge = in.nextInt();
		in.close();
		
		double pricePerKm = 0.21;
		double under18Discount = 0.20;
		double over65Discount = 0.40;
		double totalCost = 0;
		
		if (userAge < 18) {
			totalCost = userKm * pricePerKm * (1-under18Discount);
		} else if (userAge > 65) {
			totalCost = userKm * pricePerKm * (1-over65Discount);
		} else {
			totalCost = userKm * pricePerKm;
		}
		
		System.out.println("Il prezzo finale è: " + totalCost + "euro");
		
	}
}
