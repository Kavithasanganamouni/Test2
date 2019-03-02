package tes2;

import java.util.Scanner;

public class FixedAccount {
	 public void calculateInterest()
	{
		
		Scanner sc=new Scanner(System.in);
	System.out.println("enter fixed amount:");
		int fixedAmount=sc.nextInt();
		System.out.println("enter number of years");
		int years=sc.nextInt();
		System.out.println("enter rate of inetrest");
		int rate=sc.nextInt();
		int interest=(fixedAmount*rate*years)/100;
		System.out.println("the interest is:"+interest);
		
	}
	public class Savings extends FixedAccount
	{
		 public void calculateInterest()
		{
			super.calculateInterest();
			
		}
	}
public static void main(String[] args) {
	FixedAccount fixed=new FixedAccount();
	fixed.calculateInterest();
	
	
	
}
}
