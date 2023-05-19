package Basic;

import java.util.Scanner;

public class scanneruntil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary of an Employee");
		double s=sc.nextDouble();
		
		double tax =(s* 12)/100;
		
		System.out.println("12% tax of the employee is:" +tax);
		
								 
	}

}
