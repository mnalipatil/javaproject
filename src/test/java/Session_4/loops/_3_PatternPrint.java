package Session_4.loops;

public class _3_PatternPrint {
	
	public static void main(String[] agrs)
	{
//		*
//		**
//		***
//		****
//		for(int i=1; i<=4; i++)
//		{
//			for(int j=1; j<=i; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		****
//		***
//		**
//		*
//		
		
		for (int i=4; i>=1; i--)
		{
			for(int j=4; j>=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
