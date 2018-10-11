package overloading;

class A
{
	public void fun1(int x)
	{
		System.out.println("A X is :"+x);
	}
}
class B extends A
{
//	public void fun1(int x)
//	{
//		System.out.println(" B X is :"+x);  //method overriding
//	}
	public void fun1(int x,int y)
	{
		System.out.println("The x is :"+x+"The y is :"+y);  //method overloading
	}
}
public class overloading {

	public static void main(String[] args) {
		//overloading o = new overloading();
		B ob = new B();
		//ob.fun1(2, 4);
		ob.fun1(3);
		ob.fun1(3,4);

	}

}
