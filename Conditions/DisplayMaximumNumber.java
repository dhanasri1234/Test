package Conditions;

import java.util.Scanner;

public class DisplayMaximumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b,c;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1 =sc.nextInt();
		
		System.out.println("Enter the second number:");
		int num2 =sc.nextInt();
		
		System.out.println("Enter the third number:");
		int num3 =sc.nextInt();
		
		int max = num1;
		if (num2> max) {
			max = num2;
		}
		if (num3 > max) {
			max = num3;
			
		}
		System.out.println("The maximum number is :" +max);
		}
		
		
		
		
	}


