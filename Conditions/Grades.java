package Conditions;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float phy, maths, eng, total, percent;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter marks of physics, maths, english:");
		phy = sc.nextFloat();
		maths= sc.nextFloat();
		eng= sc.nextFloat();
		total= phy+maths+eng;
		percent = total/3;
		System.out.println("total : "+total);
		System.out.println(" percentage :"+ percent);
	
		if (phy<=30|| maths<=30|| eng<=30){
		System.out.println("fail");
		}
		else{
			if (percent>=75)
			System.out.println("A+");
			else if(percent>=50)
				System.out.println("B");
			else
				System.out.println("fail");
		}
		}
		
		
	


	}


