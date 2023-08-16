package Session_10.constructors;

public class _1_Employee {
	
	//variables
	
            String Name;
    	    int age;
            String dept;
            int empId;
            
	static String compName = "Unicorn Sys";
	
	public static void main(String[] args)
	{
		_1_Employee e1 = new _1_Employee();
		e1.Name ="Tom";
		e1.age = 24;
		e1.dept = "QA";
		e1.empId = 100;
		
		_1_Employee e2 = new _1_Employee();
		e2.Name ="John";
		e2.age = 25;
		e2.dept = "Developer";
		e2.empId = 101;
		
		System.out.println("Employee 1 information");
		System.out.println("Name -> " + e1.Name);
		System.out.println("age -> " + e1.age);
		System.out.println("dept -> " + e1.dept);
		System.out.println("empId -> " + e1.empId);
		System.out.println("Org Name -> " + _1_Employee.compName);
		System.out.println("                            ");
		System.out.println("Employee 2 information");
		System.out.println("Name -> " + e2.Name);
		System.out.println("age -> " + e2.age);
		System.out.println("dept -> " + e2.dept);
		System.out.println("empId -> " + e2.empId);
		System.out.println("Org Name -> " + _1_Employee.compName);
	}
	
	
}
