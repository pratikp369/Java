package Theread;
import java.lang.Thread;
import java.lang.Runnable;

class A implements Runnable
{
	public void run()
	{
		int i;
		for(i=0;i<10;i++)
		{
	     System.out.println("i am A :"+i);
		}
	}
}
class B implements Runnable
{
	public void run()
	{	int i;
	for(i=0;i<10;i++)
	{
     System.out.println("i am B :"+i);
	}
	}
	}
public class MyThread 
{ 
	public static void main(String[] args) {
       
		Thread t1 = new Thread(new A());
		Thread t2 = new Thread(new B());
		t1.start();
		t2.start();
//	    for(int i=0;i<3;i++)
//	    {
//	    	System.out.println("The Thread is :"+t1);
//	    }
	}

}
 