package Conditions;

import java.util.Scanner;

public class WhileLoopEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner input = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = input.nextInt();

	        int originalNum = num;
	        int digits = 0;
	        int result = 0;

	        // Count the number of digits
	        while (originalNum != 0) {
	            digits++;
	            originalNum /= 10;
	        }

	        // Calculate the sum of the cubes of each digit
	        originalNum = num;
	        while (originalNum != 0) {
	            int digit = originalNum % 10;
	            result += Math.pow(digit, digits);
	            originalNum /= 10;
	        }

	        // Check if the result is equal to the original number
	        if (result == num) {
	            System.out.println(num + " is an Armstrong number.");
	        } else {
	            System.out.println(num + " is not an Armstrong number.");
	        }
	    }
	}





