package class_object;

public class acess_specifer {
	
	private int a,b;
	public void set(int x,int y)
	{
		a=x;
		b=y;
	}
	 protected int sum()
	 {
		 return a+b;
	 }
	 protected int mul()
	 {
		 return a*b;
	 }

	public static void main(String[] args) {
		acess_specifer ob = new acess_specifer();
        ob.set(4, 5);
        System.out.println("sum is :"+ob.sum());
        System.out.println("mul is :"+ob.mul());
	}

}
