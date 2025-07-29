package controlstatements;

import java.util.Scanner;

public class Evenorodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("enter a number");
      Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      
      if(n%2==0)
    	  System.out.println("The number " +n+ "  is even number");
      else
    	  System.out.println("The number " +n+ " is odd number");
	}

}

