package Session_15;

public class _1_ThrowsKeyword {
	
	public static void main(String[] args) 
	{
		_1_ThrowsKeyword objRef = new _1_ThrowsKeyword();
		objRef.launchBrowser();
	}
	
	public void launchBrowser() 
	{
		System.out.println("Launching browser..........");
		launchURL();
	}

	public void launchURL()
	{
		System.out.println("Launching URL..........");
		try {
			login();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void login() throws Exception 
	{
		System.out.println("Do Login");
		int a = 9/0;
	}
}
