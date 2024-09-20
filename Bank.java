package com.model;

import java.util.Scanner;
import java.util.Scanner.*;

public class Bank {
 Scanner sc=new Scanner (System.in);
 public void Deposite()    {
	 System.out.println("pls enter the Amount ");
	 Double amount= sc.nextDouble();
	 
	 if(amount>0)
	 {
		 
	 
	 System.out.println("Your amount is successfully deposited :"+amount);
	 }
	 else {
	 }
 }
 public static void main(String[] args) {
	 Bank b=new Bank();
	 b.Deposite();
 }
 
}
