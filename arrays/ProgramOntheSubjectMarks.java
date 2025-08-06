package arrays;
 import java.util.*;
 

public class ProgramOntheSubjectMarks {
 public static void main(String[] args){
	 System.out.println("enter the the number of subjects ");
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int marks[]=new int[n];
	 int total=0;
	 
	 System.out.println("The marks  of subjects");
	 for(int i=0;i<n;i++)
	 {
		
		 marks[i]=sc.nextInt();
		 total+=marks[i];
		 
		 
	 }
	 for(int i=0;i<n;i++)
	 {
		 
		 System.out.println("Subjects marks :" +marks[i]);
		 
	 }
	double average=total/n;
	System.out.println("Total marks:"+total);
	System.out.println("Average amrks:"+average);
	
 }
}
	 

