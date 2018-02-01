package by.java.unit1.ex2;

import java.util.Scanner;

public class Virashenie {

	public static void main(String[] args) {
		
		double a = 0;
		double b = 0;
		double c = 0;
		double znach;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("¬ведите a");
		if (sc.hasNextDouble()) {
			a = sc.nextDouble();
		}
		
		System.out.println("¬ведите b");
		if (sc.hasNextDouble()) {
			b = sc.nextDouble();
		}
		
		System.out.println("¬ведите c");
		if (sc.hasNextDouble()) {
			c = sc.nextDouble();
		}
		
		znach = Math.pow(a, 2) - Math.pow((b-c), 2) + Math.log(Math.pow(b, 2) + 1);
		
		System.out.println("«начение выражени€ = " + znach);
	}
}
