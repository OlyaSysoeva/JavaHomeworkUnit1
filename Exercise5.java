package by.java.unit1.ex5;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {

		int n = 0;
		int ch = 0;
		int modul = 0;
		int sum = 0;
		int number;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Введите количество чисел:");
		if (sc.hasNextInt()) {
			n = sc.nextInt();
		}
	    
		for(int i = 0; i < n; i++) {
		    System.out.println("Введите число:");
		    while  (!sc.hasNextInt()) {
		    	System.out.println("Введите число:");
		    	sc.next();
		    }
		    
		    number = sc.nextInt();
		    if ((number % 2) == 0)
		    	ch ++;
		    
		    if ((number % 3) == 0)
		    	sum += number;
		    
		    if (Math.abs(number) < 3)
		    	modul ++;
	    }
	    System.out.println("Количество чётных чисел = " + ch);
	    System.out.println("Сумма чисел, кратных 3-м = " + sum);
	    System.out.println("Количество чисел, модуль которых <3 = " + modul);
	}

}
