package loops;
import java.util.*;
public class LeapYear_Checker
{
	public static void main(String[]args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a year");
	
	//input from user
	int a=s.nextInt();
	
	//condition statement
	if(a%400==0 && a%100==0 && a%4==0)
	{
		System.out.println("Year is a leap year  ");
	}
	else if(a%100==0)
	{
		System.out.println("Year is divisible by 100 but not a leap year ");
	}
	else if(a%4==0)
	{
		System.out.println("Year is divisible by 4 but not a leap year ");
	}
	else if(a%400==0)
	{
		System.out.println("Year is  divisible by 400  but not a leap year");
	}
	else 
	{
		System.out.println("Year is not a leap year");
	}
	s.close();
}

}


