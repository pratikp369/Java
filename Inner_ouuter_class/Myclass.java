package Inner_ouuter_class;

class Outer
{
	int x=10;
	void fun()
	{
		System.out.println("Outer");
	}
//	static class inner
//	{
//		public void fun2()
//		{
//			System.out.println("Inner");
//		}
//	}
	class inner
	{
		public void fun2()
		{
			System.out.println("Inner"+x);
		}
	}

}
public class Myclass {
	public static void main(String [] args)
	{
	Outer o1 = new Outer();
Outer.inner o = o1.new inner();
    o.fun2();
}
}