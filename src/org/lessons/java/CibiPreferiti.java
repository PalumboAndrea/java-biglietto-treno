package org.lessons.java;

public class CibiPreferiti {
	public static void main(String[] args) {
		String[] cibiPreferiti = {"Pizza", "Sushi", "Risotto allo zafferano", "Spaghetti allo scoglio", "Spaghetti alle vongole", "Risotto agli asparagi", "Zuppa di cozze", "Fritto misto"};
		
		System.out.println("La lunghezza dell'array é: " + cibiPreferiti.length);
		System.out.println("Il mio cibo preferito è: " + cibiPreferiti[0]);
		System.out.println("Il mio cibo meno preferito è: " + cibiPreferiti[cibiPreferiti.length - 1]);
		if (cibiPreferiti.length % 2 == 0) {
			System.out.println("A metà c'è: " + cibiPreferiti[cibiPreferiti.length / 2 - 1]);
		} else {
			System.out.println("A metà c'è: " + cibiPreferiti[(cibiPreferiti.length - 1) / 2]);
		}
	}
}
