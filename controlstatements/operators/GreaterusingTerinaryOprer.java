package operators;

import java.util.*;
public class GreaterusingTerinaryOprer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println("enter two numbers");
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int b=sc.nextInt();
  int greater=(a > b) ? a : (a < b) ? b : a;
  
  if(a==b)
	  System.out.println("both are equal");
  else
	  System.out.println("Greater is :"+greater);
	}

}
