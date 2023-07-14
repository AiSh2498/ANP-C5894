/*
 * Write a Java program that asks the user to enter a series of numbers 
 * (positive or negative) and calculates their sum.
 *  The program should stop asking for input when the user enters 0. 
 *  Use a do-while loop to continuously ask for numbers
 *  and keep adding them to the sum.
 */
package loops;

import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//scanner class object
				Scanner sc=new Scanner(System.in);
				
				//variable declaration
				int number;
				int sum=0;
				//do loop
				do
				{
					System.out.println("Enter a number to be added: ");
					
					//user input
					number= sc.nextInt();
					sum+=number;
				}
				//test expression
				while(number!=0);
				
				System.out.println("sum of the numbers is"+sum);
				sc.close();
	}

}
