package loops;
import java.util.*;
public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// using scanner class to take input from user
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your age");
		
		//input from user
		int a=s.nextInt();
		
		//condition statement
		if(a>=18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			System.out.println("Not eligible for voting");
		}
		s.close();
	}

}
