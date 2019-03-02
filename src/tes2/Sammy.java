package tes2;

import java.util.Scanner;
class AgeException extends Throwable
{
public AgeException(String s)
{
	System.out.println(s);
}
	
}

public class Sammy {
	
public static void userDetails()throws AgeException
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter user name");
	String userName=sc.next();
	System.out.println("enter user contact number");
	long contact=sc.nextInt();
	System.out.println("enter user age");
	int age=sc.nextInt();
	System.out.println(userName+contact+age);
	if(age<20 || age>55)
	
		throw new AgeException("age is not valid");
	
}

	public static void main(String[] args)throws AgeException {
		Sammy user=new Sammy();
		user.userDetails();

	}
	

}
