package by.java.unit1.ex1;

import java.util.Scanner;

public class Treygolnik {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double a = 0; 
		double b = 0;
		double g;
		double s;
		
		System.out.println("Введите катет a: ");
		if (sc.hasNextDouble()) {
			a = sc.nextDouble();
		}    
		
		System.out.println("Введите катет b: ");
		if (sc.hasNextDouble()) { 
			b = sc.nextDouble();
		}	

		if ((a>0) && (b>0)) {
		   g = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
		   s = (a+b)/2;
		   System.out.println("Гипотенуза = " + g);
		   System.out.println("Площадь треугольника = " + s);
		}
		else
		   System.out.println("Неверные значения катетов, попробуйте ещё раз");
		
		

	}

}
