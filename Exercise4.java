package by.java.unit1.ex4;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		
		double a = 0;
		double b = 0;
		double c = 0;
		double sum;
		double sum1;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("������� ����� a");
        if (sc.hasNextDouble())
        	a = sc.nextDouble();
        
        System.out.println("������� ����� b");
        if (sc.hasNextDouble())
        	b = sc.nextDouble();
        
        if (a == b)
        	System.out.println("����� ����� ���!");
        else {
        	System.out.println("������� ����� c");
        	if (sc.hasNextDouble())
        		c = sc.nextDouble();
        	sum = a + b + c;
        	sum1 = Math.pow(a, 2) + Math.pow(b, 2);
        	System.out.println("����� a, b, c = "+ sum);
        	System.out.println("����� a^2 � b^2 = "+ sum1);
        	System.out.println("��� ������� ���������� �������");
        }	
        	
	}

}
