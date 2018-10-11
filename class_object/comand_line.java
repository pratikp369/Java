package class_object;

public class comand_line {

	public static void main(String[] args) {
//		
//		int l=args.length;
//		for(int i=0;i<l;i++)
//		{
//			System.out.println("value is :"+args[i]);
//		}
		int sum=0;
		int l=args.length;
		for(int i=0;i<l;i++)
		{
			sum=sum+Integer.parseInt(args[i]);
		//	System.out.println("value is :"+args[i]);
		}
		System.out.println(sum);

	}

}
