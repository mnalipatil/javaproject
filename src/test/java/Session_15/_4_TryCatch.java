package Session_15;

public class _4_TryCatch {
	
	static int x = 9;
	static int y = 0;
	
    public static void main(String[] args)
    {
    	_4_TryCatch tc = new _4_TryCatch();
    	tc.division(x, y);

	}
	
	public void division(int Ny, int Dy)
	{
		try
		{
			int division = Ny/Dy;
			System.out.println("The division of input -> " + Ny +" with " +Dy+ " is -> " + division);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("An exception occured while having the division");
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
			System.out.println("An exception occured while having the division");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("An exception occured while having the division");
		}

	}
	

}
