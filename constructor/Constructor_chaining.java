package constructor;

class Mya
{
	public Mya()
	{
		System.out.println("A");
	}
}
class Myb extends Mya
{

	public Myb() {
		this(6);                   //constructor chaining
		System.out.println("B");
	}
	public Myb(int x)
	{
		System.out.println("B into K value is :"+x);
	}
}
public class Constructor_chaining {

	public static void main(String[] args) {
       Myb ob = new Myb();
	}

}
