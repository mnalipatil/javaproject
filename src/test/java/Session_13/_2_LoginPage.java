package Session_13;

public class _2_LoginPage extends _1_Page{
	
	public _2_LoginPage()
	{
		System.out.println("Login Page const.............");
	}

	@Override
	public void title() {
		System.out.println("Login Page title");
		
	}

	@Override
	public void url() {
		System.out.println("Login Page url");
		
	}

	@Override
	public void footerLinks() {
		System.out.println("Login Page footerLinks");
		
		
	}
	
	@Override
	public void logo() {
		System.out.println("Login Page logo");
		
	} 
	
	
	// Special method for login page class
	public void doLogin()
	{
		System.out.println("Login to app-------");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
