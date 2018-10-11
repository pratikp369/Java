package class_object;

public class Box {
	
	private int legnth,breadth,height;
	public void setd(int l,int b,int h)
	{
		legnth=l;
		breadth=b;
		height=h;
	}
	public void show()
	{
		System.out.println("Legnth is :"+legnth);
		System.out.println("breadth is :"+breadth);
		System.out.println("highet is :"+height);
	}

	public static void main(String[] args) {
      Box b = new Box();
      b.setd(3, 4, 6);
      b.show();

	}

}
