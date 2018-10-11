package Array;
import java.util.Scanner;
public class Mattrix_Multilplication {
	
	int [][] m = new int[3][3];
	int i,j;
	Scanner sc = new Scanner(System.in);
	void input() {
		System.out.println("----Matrix Multiplication---");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.println("Enter Number :"+i+""+j+":");
				m[i][j]=sc.nextInt();
			}
		}
	}
	void multiplication()
	{
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				m[i][j]=m[i][j]*m[i][j];
			}
		}
	}
	void display()
	{
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.println("multiplication is :"+m[i][j]);
			}
		}
			}
	public static void main(String[] args) {
		
		Mattrix_Multilplication mul = new Mattrix_Multilplication();
		mul.input();
		mul.multiplication();
		mul.display();
	}

}
