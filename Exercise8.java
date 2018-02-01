package by.java.unit1.ex8;

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {

		double a = 0, b = 0, c = 0;
		double a1 =0, b1 = 0, c1 = 0;
		Scanner sc = new Scanner (System.in);
		
		System.out.print("¬ведите число a:");
			a = sc.nextDouble();
		if (a > 0) {
			a1 = Math.pow(a,2);
		System.out.println ( + a1);
		}
		else {
			a1 = Math.pow(a,4);
			System.out.println( + a1);
		}	
		
		System.out.print("¬ведите число b:");
			b = sc.nextDouble();
		if (b > 0) {
			b1 = Math.pow(b,2);
			System.out.println( + b1);
		}	
		else {
			b1 = Math.pow(b,4);
			System.out.println( + b1);
		}	
		
		System.out.print("¬ведите число c:");
			c = sc.nextDouble();
		if (c > 0) {
			c1 = Math.pow(c,2);
			System.out.println ( + c1);
		}	
		else {
			c1 = Math.pow(c,4);
			System.out.println ( + c1);
		}	
		
	}

}
