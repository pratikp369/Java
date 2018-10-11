package class_object;

public class initilization_class {
	private int x;
	{
		System.out.println("the x is :"+x);
		x=5;
	}
	public initilization_class()
	{
		System.out.println("x is :"+x);
	}

	public static void main(String[] args) {
		
	initilization_class i = new initilization_class();
	initilization_class k = new initilization_class();
	}

}
