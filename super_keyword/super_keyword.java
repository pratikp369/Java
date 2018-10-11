
package super_keyword;

class A
{
	int z;
	public void fun1()
	{
		System.out.println("Hello A Fun1");
	}
}
class B extends A
{
	int z;
	public void fun1()
	{
		super.fun1();
		System.out.println("Hello B Fun1");
	}
	public void fun2()
	{
		int z;
		z=4;
		this.z=5;
		super.z=6;
	}
}
public class super_keyword {

	public static void main(String[] args) {
     
		B ob = new B();
		ob.fun1();
	}

}
