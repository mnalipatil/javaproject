package Session_4.arraysinjava;

public class _1_ArraysInJava {
	
	public static void main(String[] args)
	{
//		int i = 10;
//		
////		System.out.println(i);
//		
//		i = 20;
////		System.out.println(i);
//		
//		i = 30;
//		System.out.println(i);
		
		int [] q = new int[5]; //0 1 2 3 4
		
		int x[] = new int[10]; // 0 1 2
		
		int []y = new int[2]; //0 1
		
		
		x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		x[3] = 40;
		x[4] = 45;
		x[5] = 99;
		x[6] = 60;
		x[7] = 67;
		x[8] = 99;
		x[9] = 90;
		
//		System.out.println(x[0]+x[0]); // 10+10 =20
//		
//		int z[] = {10,20,30};
//		
//		System.out.println(x[3]);
//		
//		System.out.println(y.length);
//		
		
//		for(int k=0; k<x.length; k++)
//		{
//			if(x[k] == 99)
//			{
//			System.out.println("The index position of value 45 is ->" + k);
//			break;
//			}
//		}
//		
		// example no.2
		
		double k1[]= new double[5]; // 0 1 2 3 4
		
		k1[0] = 12.33;
		k1[1] = 44.55;
	    k1[2] = 35.67;
	    k1[3] = 50;
	    k1[4] = 99.00;
//	    k1[7] = 55.43;
//	    
//	    System.out.println(k1[3]);
//		
		
	    // example no. 3
	    
	    String browser[] = new String[4];
	    browser[0] = "chrome";
	    browser [1] = "opera";
	    browser [2] = "firefox";
//	    browser[3] = "ie";
	    browser[3] = "safari";
	    
	    for(int i=0; i<browser.length; i++)
	    {
	    	if(browser[i].equals("chrome"))
	    	{
	    		System.out.println("Launch chrome....");
	    	}
	    	else if(browser[i].equals("opera"))
	    	{
	    		System.out.println("Launch opera....");
	    	}
	    	else if(browser[i].equals("firefox"))
	    	{
	    		System.out.println("Launch firefox....");
	    	}
	    	else if(browser[i].equals("ie"))
	    	{
	    		System.out.println("Launch ie....");
	    	}
	    	else
	    	{
	    		System.out.println("No browser matches, enter the correct value");
	    	}
	    }
	    		
		
	    Object emp[] = new Object[5];
	    emp[0] = "Tom";
	    emp[1] = 24;
	    emp[2] = 26000;
	    emp[3] = false;
	    emp[4] = 'M';
		
	    System.out.println("The name of the employee is " + emp[0]);
	    
	    for(int i=0; i<emp.length; i++)
	    {
	    	System.out.println(emp[i]);
	    }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
