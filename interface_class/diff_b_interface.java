package interface_class;

interface A
{
	void abc();
}
abstract class Dummy implements A
{
	public void abc() {
		System.out.println("Hi I am Abc");
	}
	abstract void myDummy();
}
class xyz extends Dummy
{
	void myDummy() {
		System.out.println("Hi I am Mydummy");
	}
	
}
public class diff_b_interface {

	public static void main(String[] args) {
		xyz b = new xyz();
		b.abc();
		b.myDummy();
      
	}

}
