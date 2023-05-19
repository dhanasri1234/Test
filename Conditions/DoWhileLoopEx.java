package Conditions;

import java.util.Scanner;

public class DoWhileLoopEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     Scanner scanner = new Scanner(System.in);
	        char ch;
	        do {
	            System.out.print("Enter a character: ");
	            ch = scanner.next().charAt(0);
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
	                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
	                System.out.println(ch + " is a vowel");
	            } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
	                System.out.println(ch + " is a consonant");
	            } else {
	                System.out.println(ch + " is not a letter");
	            }
	        } while (true);
	    }

	}