package loops;
import java.util.*;
public class Divisibility1 {
	public static void main(String[]args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a value");
	
	//input from user
	int a=s.nextInt();
	
	//condition statement
	if(a%2==0 &&a%3==0 )
	{
		System.out.println("Number is divisible by 2and 3 ");
	}
	else if(a%3==0)
	{
		System.out.println("Number is divisible by 3 only");
	}
	else if(a%2==0 )
	{
		System.out.println("Number is divisible by 2 only");
	}
	else
	{
		System.out.println("Number is not divisible by neither");
	}
	s.close();
}

}


