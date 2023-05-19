package Conditions;

import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		double num =sc.nextDouble();
		
		if(num %2 ==0) {
			System.out.println(num +"is  an even number");
		} else {
			System.out.println(num +"is  an odd number");
		}
			
			
		}
		
		
		
	}

