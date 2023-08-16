package Session_13;

public abstract class _1_Page {
	
	public _1_Page()
	{
	System.out.println("Page const-----------");
	}

	
	public abstract void title(); // abstract method/ prototype method
	public abstract void url(); // abstract method/ prototype method
	public abstract void footerLinks(); // abstract method/ prototype method
	
	// Non Static method
	public void logo()
	{
		System.out.println("Page ------ logo");
	}
	
	public final void privacyPolicy()
	{
		System.out.println("Page ------privacyPolicy ");
	}
}
