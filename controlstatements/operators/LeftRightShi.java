package operators;

import java.util.Scanner;

public class LeftRightShi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter the number");
		 Scanner sc=new Scanner(System.in);
		 int a=sc.nextInt();
		 a>>=1;
		 System.out.println("Right shift a value is : " +a);
		 a<<=1;
		 System.out.println("left shift a value is : " +a);
		
	}

}
