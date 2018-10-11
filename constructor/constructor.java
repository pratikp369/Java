package constructor;

class A
{
	int a;
//	A()
//	{
//		System.out.println("a");
//	}
	A(int x)
	{
		a=x;
	}
	public void show()
	{
	System.out.println(a);
	}
}
class B extends A
{
	B()
	{
		super(3);  // if i am not wrote then compiler write that
		System.out.println("b");
	}
}

public class constructor {

	public static void main(String[] args) {
		
B ob = new B();
ob.show();
	}

}
