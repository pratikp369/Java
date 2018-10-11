package interface_class;

interface person
{
	void setData(int a,String m);
	void getData();
}
class per implements person
{
private int id;
private String name;
 public void setData(int i,String n)
 {
	 id=i;
	 name=n;
 }
 public void getData()
 {
	 System.out.println("id is :"+id);
	 System.out.println("name is :"+name);
 }
}
public class myinterface {

	public static void main(String[] args) {
per p = new per();
p.setData(12, "pratik");
p.getData();
	}

}
