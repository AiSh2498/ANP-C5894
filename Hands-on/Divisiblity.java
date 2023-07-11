package loops;
import java.util.*;
public class Divisiblity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value");
		
		//input from user
		int a=s.nextInt();
		
		//condition statement
		if(a%5==0 && a%11==0)
		{
			System.out.println("Number is divisible ");
		}
		else
		{
			System.out.println("Number is not divisible");
		}
		s.close();
	}

}
