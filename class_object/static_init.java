package class_object;

public class static_init {

	private static int k;
	static
	{
		System.out.println("K is :"+k);
		k=10;
	}
	static_init(){
	System.out.println(k);
	}
	public static void main(String[] args) {
		new static_init();

	}

}
