package by.java.unit1.ex7;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		double znach;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("������� ����� a:");
		if (sc.hasNextDouble())
			a = sc.nextDouble(); 
		
		System.out.println("������� ����� b:");
		if (sc.hasNextDouble())
			b = sc.nextDouble();
		
		System.out.println("������� ����� c:");
		if (sc.hasNextDouble())
			c = sc.nextDouble();
		
		System.out.println("������� ����� d:");
		if (sc.hasNextDouble())
			d = sc.nextDouble();
		
		znach = a/c*(b/d)-((a*b-c)/(c*d));
		
		System.out.println("�������� ��������� =" + znach);
	}

}
