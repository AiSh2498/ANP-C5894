package loops;
import java.util.*;

public class RightAngleTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);

System.out.println("Enter the number of rows for the triangle:");
int rows=s.nextInt();

for(int i=1; i<=rows;i++)
{
	for(int j=1; j<=i;j++)
	{
		System.out.print("*");
	}
	System.out.println();
}
s.close();
	}

}
