package Session_9.Overloading;

public class _1_LoginToApp {
	
	public void login()
	{
		System.out.println("Login with zero parameter");
	}
	
	public void login(String username)
	{
		System.out.println("Login with one parameter username");
	}
	
	public void login(int otp)
	{
		System.out.println("Login with one parameter otp");
	}

	public void login(String username, String password)
	{
		System.out.println("Login with two parameter username and password");
	}
	
	public void login(long phoneNum, String password)
	{
		System.out.println("Login with two parameter phoneNum and password");
	}
	
	public void login(String password,long phoneNum)
	{
		System.out.println("Login with two parameter username and phoneNum");
	}
	
	public void login(String emailId,int otp)
	{
		System.out.println("Login with two parameter emailId and otp");
	}
	
	public static void main(String[] args)
	{
	_1_LoginToApp logInUser = new _1_LoginToApp();
	logInUser.login(65443867, "htregfku");
	}
}














