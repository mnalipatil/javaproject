package Session_16;

public class _1_FinallyBlock {
	
	public static void main(String[] args)
	{
		int a = 10;
		
//		try 
//		{
//			System.out.println("Division Process------------");
//			//int k = a/5;
//			int k = a/0;
//		} 
//		catch (Exception e)
//		{
//			e.printStackTrace();
//			System.out.println("Some Exception Occured------------");
//
//		}
//		finally
//		{
//			System.out.println("Division Ended------------");
//
//		}
		
		try 
		{
			System.out.println("Division Process------------");
			//int k = a/5;
			int k = a/0;
		} 
		finally
		{
			System.out.println("Division Ended------------");

		}
	}

}
