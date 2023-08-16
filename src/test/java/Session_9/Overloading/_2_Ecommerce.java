package Session_9.Overloading;

public class _2_Ecommerce {

	public void search(String prodName)
	{
		System.out.println("Search with one parameter");
	}
	
	public void search(String prodName, int price)
	{
		System.out.println("Search with two parameter");
	}
	
	public void search(String prodName, int price, String sellerName)
	{
		System.out.println("Search with three parameter");
	}
	
	public void payment(long CCNumber)
	{
		System.out.println("Search with one parameter");
	}
	
	public void payment(long CCNumber, String password)
	{
		System.out.println("Search with two parameter");
	}
	
	public void payment(long CCNumber, String password, int CWNum)
	{
		System.out.println("Search with three parameter");
	}
	
	public static void main(String[] args)
	{
	
	_2_Ecommerce user = new _2_Ecommerce();
	user.search("Mobile");
	user.search("TV", 25000);
	user.search("IPhone", 75000, "Unicorn Systems");
	}
	
	
}
