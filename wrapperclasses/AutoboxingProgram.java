package wrapperclasses;

import java.util.Scanner;

public class AutoboxingProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.print("Enter the number:");
	Scanner sc=new Scanner(System.in);
	int i=sc.nextInt();
    Integer autobox=i;
    System.out.println("Auto Boxing number: " +autobox);
    
	}

}
