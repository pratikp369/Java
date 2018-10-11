package IO;
import java.util.Scanner;
public class Input {
	private int x;
	Scanner sc = new Scanner(System.in);
	void takeinput()
	{
		System.out.println("Enter X:");
		x=sc.nextInt();
	}	
		public void show()
		{
			System.out.println("X is :"+x);
		}

	public static void main(String[] args) {
	
 Input i = new Input();
 i.takeinput();
 i.show();
	}

}
