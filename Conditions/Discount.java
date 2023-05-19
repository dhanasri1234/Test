package Conditions;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the purchase amount");
		double amount =sc.nextDouble();
		double discount;
		if (amount<=10000) {
			discount=amount*10/100;
			
		}
		else {
			discount= amount*2/100;
			System.out.println("discount amount is"+discount);
		}
		
	}

}
