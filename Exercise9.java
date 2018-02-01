package by.java.unit1.ex9;

import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) {
	
		double a = 0;
		double b = 0;
		double h = 0;
		double fx;
		double x = 0;
		int i = 0;
		Scanner sc = new Scanner (System.in);
		
		System.out.print("¬ведите параметры нижней точки отрезка:");
		if (sc.hasNextDouble())
			a = sc.nextDouble();
		
		System.out.print("¬ведитее параметры верхней точки отрезка:");
		if (sc.hasNextDouble())
			b = sc.nextDouble();
		
		System.out.print("¬ведите значение шага:");
		if (sc.hasNextDouble())
			h = sc.nextDouble();
		
		System.out.print("¬ведите значение x:");
		if (sc.hasNextDouble())
			x = sc.nextDouble();
		
		while (x<=b) {
	        x = a + i * h;        
	                fx = 2 * Math.tan(x/2) + 1;  
	                System.out.println( x +" "+ fx  );
	            
	         i++;
	    }

		
	}

}
