package Array;
import java.util.Scanner;
public class Array {
    int a[] = new int[10];
    int n,i,j;
    public void input()
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter How many numbre :");
    	n=sc.nextInt();
    	System.out.println("--Enter Number--");
    	for(i=0;i<n;i++)
    	{
    		System.out.print("Enter number "+i+":");
    		a[i]=sc.nextInt();
    	}
    }
    public void display()
    {
    	for(i=0;i<n;i++)
    	{
    		System.out.println("Enter number is :"+a[i]);
    	}
    }
	public void sort()
	{
	//	int len=a.length;
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j]){
					int temp;
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
	}

	public static void main(String[] args) {
              
             //     int[] arr = new int[5];         //5 size array
		Array d = new Array();
		d.input();
		d.display();
		d.sort();
		d.display();
		}

}
