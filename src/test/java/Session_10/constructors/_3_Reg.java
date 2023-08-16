package Session_10.constructors;

public class _3_Reg {
	
	String firstName;
	String lastName;
	long phonenumber;
	String emailId;
	String Password;
	String address;
	String ddMMyyyy;
	
	public _3_Reg()
	{
		System.out.println("Zero Parameter const.......");
	}

	// With some values(Non detailed reg)
	public _3_Reg(String firstName,String lastName, String Password)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.Password = Password;
	}
	
	// With all values(Non detailed reg)
		public _3_Reg(String firstName,String lastName, String Password , long phonenumber, String emailId, String address, String ddMMyyyy )
		{
			this.firstName = firstName;
			this.lastName = lastName;
			this.Password = Password;
			this.phonenumber = phonenumber;
			this.emailId = emailId;
			this.address = address;
			this.ddMMyyyy = ddMMyyyy;
		}
	
		public void nonDetailedReg()
		{
			System.out.println("Process your input information with.....");
			System.out.println("FirstName as -> " + firstName);
			System.out.println("LastName as -> " + lastName);
			System.out.println("Password as -> " + Password);
		}
		
		public void DetailedReg()
		{
			System.out.println("Process your input information with.....");
			System.out.println("FirstName as -> " + firstName);
			System.out.println("LastName as -> " + lastName);
			System.out.println("Password as -> " + Password);
			System.out.println("PhoneNumber as -> " + phonenumber);
			System.out.println("EmailId as -> " + emailId);
			System.out.println("Address as -> " + address);
			System.out.println("DOB as -> " + ddMMyyyy);
		}
	
	
	
	
	
		
		
		
		
		
		
}
