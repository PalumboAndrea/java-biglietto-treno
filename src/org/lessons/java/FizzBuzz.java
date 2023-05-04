package org.lessons.java;
import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Che numero vuoi?");
		int userInput = in.nextInt();
		in.close();
		
		for (int i = 1; i<userInput + 1; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}
}
