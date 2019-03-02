package tes2;

import java.util.Scanner;

public class DavidSalary {
	public void salary()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter david's basic salary");
		int salary=sc.nextInt();
		System.out.println("David's HRA of net Salary is:");
		int hra=salary/2;
		System.out.println(hra);
		System.out.println("David's Special allowance is:");
		int specialAllowance=(3*salary)/4;
		System.out.println(specialAllowance);
		System.out.println("David's PF dedcution is:");
		int pfDeduction=(3*salary)/25;
		System.out.println(pfDeduction);
		System.out.println("Print net amount of David ");
		int netAmount=salary-(hra+specialAllowance+pfDeduction);
		System.out.println("the net amount is"+Math.abs(netAmount));
	}
	

	public static void main(String[] args) {
		DavidSalary david=new DavidSalary();
		david.salary();

	}

}
