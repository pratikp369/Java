package String_Class;

public class String_Testing_Method {

	public static void main(String[] args) {
		String s1 = new String("pratik");
		String s2 = new String("patel");
		String s3;
		String s4="pratiK";
		String m1="patal";
		String m2="patem";
		System.out.println(s1.toUpperCase());
		System.out.println(s1.isEmpty());
		System.out.println(s1.toLowerCase());
       s3=s1+s2;
       System.out.println("The concat string is :"+s3);
       System.out.println("Index :"+s2.indexOf("e"));
       System.out.println("custom search :"+s2.indexOf("e",2));
       System.out.println("The String find: "+s2.indexOf("tel"));
       System.out.println("last index"+s2.lastIndexOf("l",4));
       System.out.println("The Cmp :"+s4.equalsIgnoreCase(s1));
       System.out.println(s1.compareTo(s4));
       
       int i=m1.compareTo(m2);
       if(i==0)
       {
    	   System.out.println("Same");
       }
       else if(i>0)
       {
       System.out.println("oopposite to dictionary order");
       }
	}

}
