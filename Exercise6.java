package by.java.unit1.ex6;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		 
		 int number;
		 double number1;
		 int ch = 0;
		 int more15 = 0;
		 Scanner sc = new Scanner (System.in);
		 
		 System.out.println("¬ведите количество чисел:");
		 while (!sc.hasNextInt()) {
			 System.out.println("¬ведите количество чисел:");
			 sc.next();
		 }
		 number = sc.nextInt();
		 while (number < 0);
		 
		 for (int i = 0; i < number; i++) {
			 System.out.println("¬ведите число;");
			 while (!sc.hasNextDouble()) {
				 System.out.println("¬ведите число;");
				 sc.next();
			 }
			 number1 = (int) (sc.nextDouble());
			 
			 if ((number1 % 2) == 0) {
				 ch++;
			 }
			 if(number1 > 15) {
				 more15++;
			 }
		}
		 System.out.println("„исло чЄтных чисел = " + ch);
		 System.out.println("„исло чисел болье 15 = " + more15);
	}

}
