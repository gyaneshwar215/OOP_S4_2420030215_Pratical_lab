package operators;

import java.util.*;
public class CompoundAssignmentOperator {
 public static void main(String[] args) {
	 System.out.println("enter the number");
	 Scanner sc=new Scanner(System.in);
	 int a=sc.nextInt();
	 a+=1;
	 System.out.println("addition assignment a value is : " +a);
	 a-=2;
	 System.out.println("Subtraction assignment a value is : " +a);
	 a*=3;
	 System.out.println("Multiplication assignment  a value is : " +a);
	 a/=5;
	 System.out.println("division assignment a  value is : " +a);
	 a%=10;
	 System.out.println("Modulo assignment a value is : " +a);
	
 }
}
