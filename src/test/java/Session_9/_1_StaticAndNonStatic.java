package Session_9;

public class _1_StaticAndNonStatic {
	
	String name;
	static int age = 25;
	
	public void getname()
	{
		System.out.println("get name");
	}
	
	public static void getStart()
	{
		System.out.println("get Start");
	}
	
	public static void main(String[] args)
	{
//		getStart();
//		System.out.println(age);
////		
//		_1_StaticAndNonStatic.getStart();
//		System.out.println(_1_StaticAndNonStatic.age);
//		
//		_1_StaticAndNonStatic objRefName = new _1_StaticAndNonStatic();
//		
//		objRefName.getname();
//		objRefName.name = "Tom";
//		System.out.println(objRefName.name);
//		
//		objRefName.getStart();
//		System.out.println(objRefName.age);
		
//		new _1_StaticAndNonStatic().getname();
//		System.out.println(new _1_StaticAndNonStatic().name = "steve");
		
		_1_StaticAndNonStatic objref1 = new _1_StaticAndNonStatic();
		
//		objref1.getname();
		objref1 = null;
		objref1.getname();
		
	
		
		
		
		
		
		
	}

}
