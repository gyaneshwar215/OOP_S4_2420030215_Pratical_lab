package operators;

import java.util.*;


public class ArithmeticOperators {
	public static void main(String[] args) {
		System.out.print("Enter two numbers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		int d=a-b;
		int f=a*b;
		int r=a/b;
		
		System.out.println("the sum of " +a+ " and " +b+ " : " +c);
		System.out.println("the sub of " +a+ " and " +b+ ": " +d);
		System.out.println("the mul of " +a+ " and " +b+ ": " +f);
		System.out.println("the div of " +a+ " and " +b+ " : " +r);
	}
	

}
