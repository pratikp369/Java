package class_object;

public class Car {
	private int speed;
	private String name;
	public void setspeed(int x)
	{
		speed=x;
	}
	public void setname(String n)
	{
		name=n;
	}
	public void getinfo()
	{
		System.out.println("var name is " +name);
		System.out.println("Car speed is :"+speed);
	}
	class sportcar extends Car
	{
	 private int sspeed;
	 //private int diff;
	 public void setsspeed(int s)
	 {
		 sspeed=s;
	 }
	 public int diif()
	 {
		 return speed-sspeed;
	 }
	 public void sgetinfo()
		{
			System.out.println("var name is " +name);
			System.out.println("Car speed is :"+speed);
			System.out.println("Sports car speed is "+sspeed);
			System.out.println("Diffrence between both car speed :"+diif());
		}
		
	}

	public static void main(String[] args) {

       Car a= new Car();
       a.setname("duster");
       a.setspeed(300);
       a.getinfo();
		
		}

}
