package Abstract_Class;

abstract class person
{
	private String name;
	private String gender;
	private int age;
	public void setData(String n,String g,int a)
	{
		name=n;
		gender=g;
		age=a;
	}
	public void getData()
	{
		System.out.println("name is :"+name);
		System.out.println("gender is :"+gender);
		System.out.println("age is :"+age);
	}
}
class student extends person
{
	int rollno;
	String Dept;
	void setD(int x,String d)
	{
		rollno=x;
		Dept=d;
	}
	public void getD()
	{
		System.out.println("rollno is :"+rollno);
		System.out.println("Dept is :"+Dept);
	}
}
class emp extends person
{
  private float salary;
  private String cname;
	public void setEmp(float s,String cn)
	{
		salary=s;
		cname=cn;
	}
	public void getEmp()
	{
		System.out.println("The Emp slary is :"+salary);
		System.out.println("The compnay name is :"+cname);
	}
}
public class Abstravct_class {

	public static void main(String[] args) {
		student s = new student();
		System.out.println("-----student Data------");
		s.setData("pratik", "male", 22);
		s.setD(118,"IT");
		s.getD();
		s.getData();
		System.out.println("-------Employe Data------");
		emp e = new emp();
		e.setData("pratik", "male", 22);
		e.setEmp(50000,"Epam pvt ltd");
		e.getData();
		e.getEmp();
	}

}
