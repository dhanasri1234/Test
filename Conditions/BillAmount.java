package Conditions;

import java.util.Scanner;

public class BillAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of calls:");
		double numcalls =sc.nextDouble();
		double billamount;
		if (numcalls<=200) {
			billamount= numcalls*1;
			
		}
		else {
			billamount= numcalls*3;
			System.out.println("your bill amount is : Rs."+ billamount);
		}
		
	}

}