package Session_10;

public class _1_OverloadMain {
	
	public static void main(String[] args)
	{
		System.out.println("Hi");
		main(10);
		main(10,20);
	}

	public static void main(int p)
	{
		System.out.println("Hey there " + p);
	}
	
	public static void main(int p, int q)
	{
		System.out.println("Bye " + p + q);
	}
	
	
	
	
	
}
