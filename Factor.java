package com.model;
import java.util.Scanner;
public class Factor {
	public static void main(String[] args) {
		int n = 28;
		for (int i=2;i<n;i++)
		{
			  if (n%i==0) {
				  System.out.println(i);
			  }

		}
		int m = 13;
		for (int i=2;i<n;i++)
		{
			  if (m%i==0) {
				  System.out.println(i);
 			  }
			  else {
				  System.out.println("13 is not divisible by any number other than 1 & 13");
		}
			  
			 
			  }
			  
 	}

}
