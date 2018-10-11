package Theread;
import java.lang.Thread;

class myA extends Thread
{
 public void run()
 {
	 int i;
	 for(i=0;i<8;i++)
	 {
		 System.out.println("Hi i am A :"+i);
	 }
 }
}
class myB extends Thread
{
	public void run()
	{
		 int i;
		 for(i=0;i<8;i++)
		 {
			 System.out.println("Hi i am B :"+i);
		 }
	}
}
public class Thread_Class {

	public static void main(String[] args) {
		
 myA o1 = new myA();
 myB o2 = new myB();
 o1.start();
 o2.start();
	}

}
