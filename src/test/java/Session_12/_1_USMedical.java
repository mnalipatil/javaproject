package Session_12;

public interface _1_USMedical extends _0_WHO{
	
	int min_fees = 10; // By default static and final
	
	public void physioServices(); // Abstract (Prototype) Method
	
	public void oncologyServices(); // Abstract (Prototype) Method
	
	public void orthopedicServices(); // Abstract (Prototype) Method
	
	public void radiologyServices(); // Abstract (Prototype) Method
	
	public static void services_911()
	{
		System.out.println("Us--- 911 services");
	}
	
	default void internship()
	{
		System.out.println("Us--- Internship");
	}

}
