package arrays;
import java.util.*;

public class ElementtobeSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Enter the no of elements");
      Scanner sc=new Scanner(System.in);
      
      int n=sc.nextInt();
      int arr[]=new int [n];
      
     
      System.out.println("Enter "  +n+ " elements");
      System.out.println("Elements are :");
      for(int i=0;i<n;i++)
      {
    	  
    	  arr[i]=sc.nextInt();
    	  
      }
      
      System.out.println("enter the elements to be search");
      int key=sc.nextInt();
      
      boolean found=false;
      for(int i=0;i<n;i++)
      {
       if(arr[i]==key) {
    	found=true;
    	break;
    	
    }
      }
      
      if(found)
     System.out.println(key + "is found in the array");
      else
    	  System.out.println(key + " is not found in the array");
      
	}

}
