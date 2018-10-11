package Inner_ouuter_class;

class A
{
	void Say()
	{
		System.out.println("Hi A");
	}
}
class B
{
 A m=	new A() {
	 public void Say()
	 {
		 System.out.println("Anonymous");
	 }
		
	};
}
public class Anonymous {

	public static void main(String[] args) {
B a = new B();
a.m.Say();
	}

}
