package controlstatements;

import java.util.Scanner;

public class NumberisPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        System.out.print("Enter a number: ");
		        Scanner sc=new Scanner(System.in);
		        int n = sc.nextInt(); 

		        if (n > 0) 
		            System.out.println(n+ " is positive");
		        else 
		            System.out.println(n+ " is negative");
		       

	}

}
