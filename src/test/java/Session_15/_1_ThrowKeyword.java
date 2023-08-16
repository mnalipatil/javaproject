package Session_15;

public class _1_ThrowKeyword {
	
//	public static void main(String[] args)
//	{
//		String username = " "; // " " // null
//		
//		if(username.equals(" ") || username.equals(null))
//		{
//			try
//			{
//				throw new Exception("Blank username exception");
//			}
//			catch(Exception e)
//			{
//				e.printStackTrace();
//				System.out.println("The user name much be a value not a blanck space or null value");
//			}
//		}
//			else
//			{
//				System.out.println("Login in with user ->" + username);
//			}
//	}		
	
	public static void main(String[] args)
	{
		launchUrl("https://www.something.com");
	}
		public static void launchUrl(String url)
		{
			if(url.equals(" "))
			{
				try
				{
					throw new Exception("Incorrect url Exception");
				}
				catch(Exception e)
				{
					e.printStackTrace();
					System.out.println("The url entered is blank");
				}
				
			}
			else
			{
				System.out.println("Launching the URL -> " + url);
			}
		}
	
		

		
	}


