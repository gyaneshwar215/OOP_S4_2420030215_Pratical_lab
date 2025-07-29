package controlstatements;

import java.util.*;

public class Mutiplicationtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number for a multliplication table");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+ " x " + i + " = " +(n*i));
			
		}
	}
}
	

