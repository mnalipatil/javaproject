package Session_16;

public class _2_FinallyBlock {
	public static void main(String[] args) 
	{
		int p = getNumber();
		System.out.println(p);
	}
	
	public static int getNumber()
	{
		int a = 10;
		int b = 0;
		
		try 
		{
			int c = a + b;
			return c;
		} 
		catch (Exception e)
		{
			return -1;
		}
		finally
		{
			System.out.println("Bye-------------");
			return 100;
		}
	}

}
