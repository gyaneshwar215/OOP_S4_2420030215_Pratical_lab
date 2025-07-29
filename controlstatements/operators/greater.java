package operators;

import java.util.*;

public class greater {
 public static void main(String[]  args){
 System.out.println("enter the two interges");
 Scanner sc= new Scanner(System.in);
 int a=sc.nextInt();
 int b=sc.nextInt();
 if(a>b)
 {
	 System.out.println(a+ " is grater");
 }
 else if(a==b)
	 System.out.println("both are equal");
 else
	 System.out.println(a+ "is small");
 
 } 
}
