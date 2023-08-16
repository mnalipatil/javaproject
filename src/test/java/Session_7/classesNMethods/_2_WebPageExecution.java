package Session_7.classesNMethods;

public class _2_WebPageExecution {

	public static void main(String[] args) 
	{
		_1_WebPage objRef = new _1_WebPage();
		objRef.topPannel();
		objRef.centerPannel();
		objRef.footerLinks();
		_1_WebPage.privacyPolicy();
		
		System.out.println(objRef.title);
		System.out.println(objRef.url);
		System.out.println(_1_WebPage.LoginMenu);
	}
}
