package by.java.unit1.ex3;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		
		double a = 0;
		double b = 0;
		double c = 0;
		double sum;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("������� ����� �");
		if (sc.hasNextDouble())
			a = sc.nextDouble();
		
		System.out.println("������� ����� b");
		if (sc.hasNextDouble())
			b = sc.nextDouble();
		
		if (a>b) {
			System.out.println("������ ����� c");
		    if (sc.hasNextDouble())
		    	c = sc.nextDouble();
		    sum = b + c;
		    System.out.println("����� a � b = " + sum);
		}
		 if (a == b)
			 System.out.println("�����");
		 
		 if (a<b) {
			 System.out.println("������ ����� c");
		     if (sc.hasNextDouble())
		    	c = sc.nextDouble();
		    sum = a + b + c;
		    System.out.println("����� a, b, c = " + sum);
		    System.out.println("����� ���!");
		 }	 
     }
}	
