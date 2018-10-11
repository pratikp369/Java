package Abstract_Class;

 abstract class fruit
{
	abstract void show();
}
class apple extends fruit
 {
void show()
{
	System.out.println("override");
}
 }
public class abstarct_method {

	public static void main(String[] args) {
   apple a = new apple();
   a.show();
   }

}
