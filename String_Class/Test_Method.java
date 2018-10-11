package String_Class;

public class Test_Method {

	public static void main(String[] args) {
		
		String n1="pratik";
		String n2="pratik";
		String n3 = new String("pratik");
		System.out.println(n1==n2);
		System.out.println(n1.equals(n2));
		System.out.println(n3==n1);
		System.out.println(n3.equals(n2));
		System.out.println(n1.indexOf("t"));
		System.out.println(n1.charAt(2));
		System.out.println(n1.substring(2));
		System.out.println(n2.concat("patel"));
		System.out.println(n2.length());
		System.out.println(n2.matches(n3));

	}

}
