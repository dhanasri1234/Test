package Conditions;

import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double salary, tax;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the salary");
		salary=sc.nextDouble();
		if (salary<=50000) {
			tax=salary*10/100;
			System.out.println("the 10% tax of salary is:"+tax);
			
		}
		else {
			tax=salary*15/100;
			System.out.println("the 15% tax of salary is : "+tax);
		}
		
	}

}
