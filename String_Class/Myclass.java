package String_Class;
import java.util.Scanner;
public class Myclass {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		String fname;
		String lname;
		System.out.println("Enter First name :");
		fname=sc.nextLine();
		System.out.println("Enter last name:");
		lname=sc.nextLine();
		if(fname.equals(lname))
		{
			System.out.print("Great Matched");
		}
		else
		{
			System.out.println("Not Mached...sorry next time try..");
		}
	}

}
