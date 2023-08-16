package Session_13;

public class _3_TestPage {
	
	public static void main(String[] args)
	{
		// _1_Page abs = new _1_Page();
		
		System.out.println("...........................");
		
		_2_LoginPage lp = new _2_LoginPage();
		lp.title();
		lp.footerLinks();
		lp.url();
		lp.doLogin();
		lp.privacyPolicy();
		lp.logo();
		
		System.out.println("...........................");
		
		_1_Page p = new _2_LoginPage();
		p.title();
		p.logo();
		p.privacyPolicy();
		//p.doLogin();
		
		System.out.println("...........................");
		
	}
	
	
	
	
	

}
