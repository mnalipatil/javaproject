package Session_15;

public class _1_tryCatch {
	public static void main(String[] args)
	{
//		System.out.println("A");
//		System.out.println("B");
//		System.out.println("C");
//		
//		int a = 9/0; // Throwing as exception
//		
//		System.out.println("E");
//		System.out.println("F");
//		System.out.println("G");
//		System.out.println("H");
		
		System.out.println("...............................");
		  
		System.out.println("A");
		System.out.println("B");
		System.out.println("C");
		 
		try
		{		
		int a = 9/0; // Throwing as exception
		}
		catch(Exception e)
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
