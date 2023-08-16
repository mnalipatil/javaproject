package Session_15;

public class _2_TryCatch {
	
	public static void main(String[] args)
	{
		System.out.println("A");
		System.out.println("B");
		System.out.println("C");
		 
		try
		{		
		int a = 9/0; // Throwing as exception
		}
		catch(ArithmeticException e)
		{
			// Handling the exception code
			e.printStackTrace();
			System.out.println("An exception occured at division of int a");
		}
		System.out.println("D");
		System.out.println("E");
		System.out.println("F");
		System.out.println("G");
	}

}
