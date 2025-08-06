package wrapperclasses;


import java.util.*;
public class BoxingProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number");
      Scanner sc=new Scanner(System.in);
      
      int i=sc.nextInt();
      Integer boxedInt=Integer.valueOf(i);
      System.out.println("Boxed Integer :" +boxedInt);
      
 
	}

}
