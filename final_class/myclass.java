package final_class;

public class myclass {
 
	private final int x;
	private final static int y;
	static
	{
		y=6;
	}
	myclass()
	{
		x=9;
//	System.out.println("x is :"+x);
	}
	public void fun()
	{   //final local variable
		final int k;
	}
	public static void main(String[] args) {

		myclass m = new myclass();
	}

}
