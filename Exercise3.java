package by.java.unit1.ex3;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		
		double a = 0;
		double b = 0;
		double c = 0;
		double sum;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Введите число а");
		if (sc.hasNextDouble())
			a = sc.nextDouble();
		
		System.out.println("Ваедите число b");
		if (sc.hasNextDouble())
			b = sc.nextDouble();
		
		if (a>b) {
			System.out.println("Ведите число c");
		    if (sc.hasNextDouble())
		    	c = sc.nextDouble();
		    sum = b + c;
		    System.out.println("Сумма a и b = " + sum);
		}
		 if (a == b)
			 System.out.println("Конец");
		 
		 if (a<b) {
			 System.out.println("Ведите число c");
		     if (sc.hasNextDouble())
		    	c = sc.nextDouble();
		    sum = a + b + c;
		    System.out.println("Сумма a, b, c = " + sum);
		    System.out.println("Новый год!");
		 }	 
     }
}	
