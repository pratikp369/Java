package class_object;

class static_member {

    int x;
    static int y;
    public void setX(int c)
    {
    	x=c;
    }
    public static void setY(int d)
    {
    	y=d;
    }
    public void display()
    {
    	System.out.println("X is :"+x+"Y is :"+y);
      }
    static class hi
    {
    	public static String myname="pratik";
    }
	public static void main(String[] args) {
		
       static_member m = new static_member();
       m.setX(6);
       static_member.setY(5);
       //m.y=6;
       m.display();
       System.out.println(static_member.hi.myname);
	}

}
