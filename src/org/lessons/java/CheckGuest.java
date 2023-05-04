package org.lessons.java;

import java.util.Scanner;

public class CheckGuest {
	public static void main(String[] args) {
		String[] invitati = {
				"Dua Lipa",
				"Paris Hilton",
				"Manuel Agnelli",
				"J-Ax",
				"Francesco Totti",
				"Ilary Blasi",
				"Bebe Vio",
				"Luis",
				"Pardis Zarei",
				"Martina Maccherone",
				"Rachel Zeilic"
		};
		Scanner in = new Scanner(System.in);
		System.out.println("Qual è il tuo nome?");
		String userName = in.nextLine();
		in.close();
		String status = "";
		
		int i = 0;
		
		// while loop
		while (i < invitati.length) {
			
			if (invitati[i].equals(userName)) {
				System.out.println("Ciao");
				status = "Sei dentro!";
				break;
			} else {
				status = "Sei fuori!";
			}
			i++;
		}
		
		// for loop
//		for (i = 0; i<invitati.length; i++) {
//			if (invitati[i].equals(userName)) {
//				System.out.println("Ciao");
//				status = "Sei dentro!";
//				break;
//			} else {
//				status = "Sei fuori!";
//			}
//		};
		
		System.out.println(status);
	}
}
