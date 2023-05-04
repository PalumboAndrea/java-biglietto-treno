package org.lessons.java;

public class CibiPreferiti {
	public static void main(String[] args) {
		String[] cibiPreferiti = {
			"Pizza",
			"Sushi",
			"Risotto allo zafferano",
			"Spaghetti allo scoglio",
			"Spaghetti alle vongole",
			"Risotto agli asparagi",
			"Zuppa di cozze",
			"Fritto misto"
		};
		System.out.println("La lunghezza dell'array é: " + cibiPreferiti.length);
		System.out.println("Il mio cibo preferito è: " + cibiPreferiti[0]);
		System.out.println("Il mio cibo meno preferito è: " + cibiPreferiti[cibiPreferiti.length - 1]);
		int medianIndex = cibiPreferiti.length / 2;
		if (cibiPreferiti.length % 2 == 0) {
			String medianFoodLow = cibiPreferiti[medianIndex];
			String medianFoodhigh = cibiPreferiti[medianIndex - 1];
			System.out.println("A metà ci sono: " + medianFoodLow + " e " + medianFoodhigh);
		} else {
			System.out.println("A metà c'è: " + cibiPreferiti[medianIndex]);
		}
	}
}
