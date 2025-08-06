package arrays;
import java.util.*;

public class ReadElementsAndPrintOnTheConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number of elements:");
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       System.out.println("enter "  +n+  " elements");
       int elements[]=new int[n];
      
       for(int i=0;i<n;i++)
       {
    	   elements[i]=sc.nextInt();
    	   
       }
       
       for(int i=0;i<n;i++)
       {
    	   System.out.println("Elements:" +elements[i]);
       }
    	   
	}

}
