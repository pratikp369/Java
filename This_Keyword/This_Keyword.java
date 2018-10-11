package This_Keyword;

class Box
{
	private int l,b,h;
	public void set(int l,int b,int h)
	{
		this.l=l;
		this.b=b;
		this.h=h;
	}
	public void display()
	{
		System.out.println("l is :"+l+"b is :"+b+"h is :"+h);
	}
}
public class This_Keyword {

	public static void main(String[] args) {
      
		Box b = new Box();
		b.set(2, 4, 5);
		b.display();
	}

}
