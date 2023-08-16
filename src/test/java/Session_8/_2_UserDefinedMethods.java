package Session_8;

public class _2_UserDefinedMethods {

	// 1. No input no return method
	
	public void test()
	{
		System.out.println("This is test method");
	}
	
	// 2. No input some return
	// Ex -1
	public String nameOfCountry()
	{
		String countryName = "India";
		return countryName;
		
	}
	
	// Ex-2
	public String[] listOfStudents()
	{
		System.out.println("Student list -");
		String names[] = new String[3];
		names[0] = "Tom";
		names[1] = "John";
		names[2] = "Steve";
		return names;
	}
	
	// 3. some input some return
	// Ex -1
	public int add(int a, int b)
	{
		int c = a + b;
		return c;
	}
	
	// Ex - 2
	public String factoryName(String nameOfFactory)
	{
		if(nameOfFactory.equals("nike"))
		{
			String fact1 = "nike";
			System.out.println("This is nike factory");
			return fact1;
		}
		else if (nameOfFactory.equals("puma"))
		{
			String fact1 = "puma";
			System.out.println("This is puma factory");
			return fact1;
		}
//		String errorMsg = "No factory with this name exist";
//		return errorMsg;
		return "No factory with this name exist";
	}
		
		// Ex. 3
		public String countryCap(String nameOfCountry)
		{
			if(nameOfCountry.equals("India"))
			{
//				String indCap = "New Delhi";
//				return indCap;
				return "New Delhi";
			}
			
			if(nameOfCountry.equals("usa"))
			{
				return "Washington DC";
			}
			return "This method can only calculate country capital for india and USA";
		}
		
		public static void main(String[] args)
		{
			_2_UserDefinedMethods userDefinedMethods = new _2_UserDefinedMethods();
			userDefinedMethods.test();			
//			String countryName = userDefinedMethods.nameOfCountry();
//			System.out.println("The country name is -> " + countryName);
			System.out.println("The country name is -> " + userDefinedMethods.nameOfCountry());
			
			String studentslist[] = userDefinedMethods.listOfStudents();
//			System.out.println(studentslist[0] + " " + studentslist[1] + " " + studentslist[2] + " ");
			
			for(int i=0; i<studentslist.length; i++)
			{
				System.out.println(studentslist[i]);
			}
//			int total = userDefinedMethods.add(10, 20);
			System.out.println(userDefinedMethods.add(10, 20));
			
			String opOffactMethod = userDefinedMethods.factoryName("nike");
			System.out.println(opOffactMethod);
			
			System.out.println(userDefinedMethods.countryCap("India"));
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
}
