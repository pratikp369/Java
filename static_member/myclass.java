package static_member;

class fruit
{
	public static void myfun()
	{
		System.out.println("Fruit");
	}
	static int y=8;
}
class apple extends fruit
{
	public static void myfun()
	{
		System.out.println("Apple");
	}
	static
	{
		y=9;
	}
}

public class myclass {

	public static void main(String[] args) {
		
    apple.myfun();
     fruit.myfun();
    System.out.println(apple.y);
    System.out.println(fruit.y);
     
	}

}
