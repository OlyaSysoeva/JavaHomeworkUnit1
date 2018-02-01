package by.java.unit1.ex10;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {

		double x = 0;
		double fx;
		Scanner sc = new Scanner (System.in);
		
		System.out.print("¬ведите x:");
		if (sc.hasNextDouble())
			x = sc.nextDouble();
		
		if (x <= 3)
			fx = 9;
		else
			fx = 1 / (Math.pow(x, 2) + 1);
		
		System.out.print("F(x) = " + fx);
	 }

}
