package Theread;

class X extends Thread
{
	public void run()
	{
		
	}
	public int sum(int x,int y)
	{
		return x+y;
	}
	public int my(int a,int b)
	{
		return a+b/a-b;
	}
}
class Y extends Thread
{
	public void run()
	{
	}
	public int mul(int x,int y)
	{
		return x*y;
	}
}
public class Thread_State {

	public static void main(String[] args) {
		X x= new X();
		Y y = new Y();
		int a,b;
		a=x.sum(3, 5);
		b=y.mul(4, 6);
		x.setPriority(5);
		y.setPriority(10);
		System.out.println("sum is :"+a);
		System.out.println("mul is :"+b);
		System.out.println(x.my(a, b));
		

	}

}
