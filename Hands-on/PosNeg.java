package loops;
import java.util.*;
public class PosNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value");
		
		int a=s.nextInt();
		
		if (a>0)
		{
			System.out.println("Number is positive");
		}
		else if(a<0)
		{
			System.out.println("Number is negative");
		}
		else
		{
			System.out.println("Number is neither positive nor negative");
		}
		s.close();
	}

}
