package Try_Catch;
import java.util.Scanner;
public class Exception {

	public static void main(String[] args) {
		

		 Scanner sc = new Scanner(System.in);
		 
		 try
		 {
			 int x,y,z;
			 System.out.println("Enter X :");
			 x=sc.nextInt();
			 System.out.println("Enter y:");
			 y=sc.nextInt();
			 System.out.println(z=x/y);
		 }
		 catch (ArithmeticException e)
		 {
			 System.out.println("Exception is fire :"+e.getMessage());
		 }
		 finally {
			System.out.println("finally"); 
		 }
				 }

}
