package Session_13.encapsulation;

public class _3_WebAutomation {
	
	public void launchBrowser()
	{
		interactWithBrowser();
	}

	public void interactWithBrowser()
	{
		checkCompatibilityOfBrowser();
	}
	
	public void checkCompatibilityOfBrowser()
	{
		 checkBrowserVersion();
	}
	
	public void checkBrowserVersion()
	{
		checkBrowserWithOS();
	}
	
	public void checkBrowserWithOS()
	{
		System.out.println("Launching of the browser........");
	}
}
