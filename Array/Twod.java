package Array;

import java.util.Scanner;

public class Twod {

	public static void main(String[] args) {
		
		int n,i,j;
        int [][] td = new int[3][3];
		Scanner sc = new Scanner(System.in);
    	System.out.print("Enter How many numbre :");
    	n=sc.nextInt();
    	System.out.println("--Enter Number--");
    	for(i=0;i<n;i++)
    	{
    		for(j=0;j<n;j++)
    		{
    		System.out.print("Enter number "+i+""+j+":");
    		td[i][j]=sc.nextInt();
    		}
    		}
    	for(i=0;i<n;i++)
    	{
    		for(j=0;j<n;j++)
    		{
    			System.out.println("Value is :"+td[i][j]);
    		}
    	}
    	}

	}

