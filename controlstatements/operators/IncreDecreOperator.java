package operators;

import java.util.*;
public class IncreDecreOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  System.out.println("post increment n++ : " +(n++));
  System.out.println("pre increment ++n : " +(++n));
  System.out.println("post decrement n--: " +(n--));
  System.out.println("pre increment --n: " +(--n));
	}

}
