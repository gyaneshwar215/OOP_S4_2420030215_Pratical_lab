package arrays;
import java.util.*;
public class SmallestandLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("enter the number of the elements in the array");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
     
      int arr[]=new int[n];
      System.out.println("enter the elements");
      for(int i=0;i<n;i++)
      {
    	  arr[i]=sc.nextInt();
    	  
      }
      int min=arr[0];
      int max=arr[0];
      for(int i=0;i<n;i++)
      {
    	  if(arr[i]<min) {
    		  min=arr[i];
    	  }
    	  if(arr[i]>max)
    	  {
    		  max=arr[i];
    	  }
      }
      System.out.println("Smallest number :" +min);
      System.out.println("Largest number :" +max);
      
	}

}
