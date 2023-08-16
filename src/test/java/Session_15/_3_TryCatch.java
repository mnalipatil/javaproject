package Session_15;

public class _3_TryCatch {
	
	public static void main(String[] args)
	{
//		_3_TryCatch tc = new _3_TryCatch();
//		try
//		{
//		tc.division(9, 0);
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//			System.out.println("An exception occured while having the division");
//
//		}
//	}
//	
//	
//	public void division(int Ny, int Dy)
//	{
//		int division = Ny/Dy;
//		System.out.println("The division of input -> " + Ny +" with " +Dy+ " is -> " + division);
//	}
		
		_3_TryCatch tc = new _3_TryCatch();
		
		tc.division(9, 0);
		
	}
	
	
	public void division(int Ny, int Dy)
	{
		try
		{
			int division = Ny/Dy;
			System.out.println("The division of input -> " + Ny +" with " +Dy+ " is -> " + division);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("An exception occured while having the division");
		}

	}
}
