package by.java.unit1.ex6;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		 
		 int number;
		 double number1;
		 int ch = 0;
		 int more15 = 0;
		 Scanner sc = new Scanner (System.in);
		 
		 System.out.println("������� ���������� �����:");
		 while (!sc.hasNextInt()) {
			 System.out.println("������� ���������� �����:");
			 sc.next();
		 }
		 number = sc.nextInt();
		 while (number < 0);
		 
		 for (int i = 0; i < number; i++) {
			 System.out.println("������� �����;");
			 while (!sc.hasNextDouble()) {
				 System.out.println("������� �����;");
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
		 System.out.println("����� ������ ����� = " + ch);
		 System.out.println("����� ����� ����� 15 = " + more15);
	}

}
