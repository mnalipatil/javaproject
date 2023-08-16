package Session_9;

public class _3_WebPages {
	
	String title;
	String url;
	String header;
	static String logo = "https://www.something.com/logoimages/logo";
	
	public void topPannel()
	{
		System.out.println("toppannel");
	}
	
	public void leftPannel()
	{
		System.out.println("leftPannel");
	}
	
	public void footerSectionPannel()
	{
		System.out.println("footerSectionPannel");
	}
	
	public static void privacyPolicy()
	{
		System.out.println("privacyPolicy");
	}
    
	public static void main(String[] args)
	{
		_3_WebPages page1 = new _3_WebPages();
		_3_WebPages page2 = new _3_WebPages();
		_3_WebPages page3 = new _3_WebPages();
		
		// assigning values to login page
		page1.title = "LoginPageTitle";
		page1.header = "Welcome to the app";
		page1.url = "https://www.something.co/login";
		
		// assigning to values home page
		page2.title = "HomePageTitle";
		page2.header = "Welcome User";
		page2.url = "https://www.something.co/HomePage";
		
//		System.out.println(" ----------- Login WebPage Start ------------");
//		System.out.println(page1.title + " " + page1.header + " " + page1.url);
//		page1.topPannel();
//		page1.leftPannel();
//		page1.footerSectionPannel();
		
		System.out.println(" ----------- Login WebPage Start ------------");
		System.out.println(page2.title + " " + page2.header + " " + page2.url);
		page2.topPannel();
		page2.leftPannel();
		page2.footerSectionPannel();
		_3_WebPages.privacyPolicy();
		System.out.println(" ----------- Login WebPage End ------------");
		
	}
	
	
	
	
	
	
	
	
	
}
