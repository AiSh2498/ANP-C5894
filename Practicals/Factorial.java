package loops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter a number to calculate its factorial:");
int number=s.nextInt();
int factorial=1;
for (int i=1;i<=number; i++)
{
	factorial*=i;
}
System.out.println("The factorial of"+number+ "is"+factorial);
s.close();
	}

}
