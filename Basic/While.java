package Basic;
import java.util.Scanner;
public class While {
	public static void main(String args[])
			{
		Scanner sc = new Scanner(System.in);
		 int num;
		 num=sc.nextInt();
		 while(num!=0)
		 {
			 System.out.println(num*num);
			 num--;
		 }
			}

}
