package operators;

import java.util.Scanner;

public class AndOrXorOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Enter the two numbers");
     Scanner sc= new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     System.out.println("Bitwise and : " +(a & b));   //and
     System.out.println("Bitwise or : " +(a | b));  //or
     System.out.println("Bitwise nor : " +(a ^ b));  //nor
     System.out.println("Bitwise complement : " +(~a ));  //complement
     
	}

}
