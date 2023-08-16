package Session_7.classesNMethods;

public class _1_WebPage {
	
	//Data members / variables
	String title = " Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazone.in";
	String url = "https://www.amazone.in/";
	String header = "Shell, Best Sell, Mobiles, Customer Services";
	String logo = "https://www.amazone.in/ref=nav_logo";
	static String LoginMenu = " This is login Menu";
	
	//Non Static Method
	
	public void topPannel()
	{
		// logic
		System.out.println("--------------------top pannel start---------------");
		System.out.println("url");
		System.out.println("This is a top pannel of the webpage");
		System.out.println(title);
		System.out.println(logo);
		System.out.println("--------------------top pannel ends---------------");
	}
	
	public void footerLinks()
	{
		System.out.println("--------------------footerLink pannel start---------------");
		System.out.println("Footer Link 1");
		System.out.println("Footer Link 1");
		System.out.println("Footer Link 1");
		System.out.println("--------------------footerLink pannel ends---------------");
	}
	
	public void centerPannel()
	{
		// logic
		System.out.println("--------------------Center pannel start---------------");
		System.out.println("Mobiles");
		System.out.println("Laptops");
		System.out.println("Books");
		System.out.println("Camera");
		System.out.println("--------------------Center pannel ends---------------");
	}
	
	// Method of type static
	public static void privacyPolicy()
	{
		// logic
		System.out.println("--------------------privacyPolicy pannel start---------------");
		System.out.println("About the business");
		System.out.println("About the vendors");
		System.out.println("privacy Notes");
		System.out.println("--------------------top pannel ends---------------");
	}

	public static void main(String[] args)
	{
		_1_WebPage xc = new _1_WebPage();
		xc.topPannel();
		xc.centerPannel();
		xc.footerLinks();
		privacyPolicy();
		
		System.out.println(xc.title);
		System.out.println(xc.url);
		System.out.println(LoginMenu);
		
		
	}
}
