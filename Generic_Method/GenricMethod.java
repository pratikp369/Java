package Generic_Method;
import java.util.Scanner;
public class GenricMethod {

	public <E> void printArray(E []a)
	{
    for(int i=0;i<a.length;i++)
    {
    	System.out.println(a[i]);
    }
	}
	public static void main(String[] args) {
     
		GenricMethod m = new GenricMethod();
		Scanner sc = new Scanner(System.in);
		int a[] = new int[] {10,50,50};
		String name[] = new String[] {"pratik","ngjkb"};
		m.printArray(a);
//		int i,n,sn;
//		System.out.println("Enter how many number :");
//		n=sc.nextInt();
//		System.out.println("Enter Number :");
//		for(i=0;i<n;i++)
//		{
//			a[i]=sc.nextInt();
//		}
////		m.printArray(a);
//		System.out.println("Enter how String :");
//		sn=sc.nextInt();
//		System.out.println("Enter Name:");
//		for(i=0;i<sn;i++)
//		{
//			name[i]=sc.nextLine();
//		}
			}
}
