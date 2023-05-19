package Conditions;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char choice;
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter letter:");
		char c=sc.next().charAt(0);
		
		switch (c) {
		case 'a': 
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(c+"is s vowel");
			break;
		
		default:
			System.out.println(c+" is a consonent ");
		break;
		}
			
	
	}

}
