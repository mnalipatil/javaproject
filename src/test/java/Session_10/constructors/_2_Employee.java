package Session_10.constructors;

public class _2_Employee {

	//variables
	
    String name;
    int age;
    String dept;
    int empId;
    
    static String compName = "Unicorn Sys";
    
    public _2_Employee()
    {
    	System.out.println("Zero Parameter Constr........");
    }
    
    public _2_Employee(int i)
    {
    	System.out.println("one Parameter int Constr........");
    }
    
    public _2_Employee(String z)
    {
    	System.out.println("one Parameter String Constr........");
    }
    
    public _2_Employee(String name, int empId)
    {
    	System.out.println(" Hi this is second parameter constructor with name and empId as a parameter");
    	this.name = name;
    	this.empId = empId;
    			
    }
    
    public _2_Employee(String name, int empId ,int age, String dept)
    {
    	this.name = name;
    	this.empId = empId;
    	this.age = age;
    	this.dept = dept;    			
    }
    
    public static void main(String[] args)
    {
//    	_2_Employee e1 = new _2_Employee("Tom", 101);
//    	_2_Employee e2 = new _2_Employee("Pat", 102);
//    	_2_Employee e3 = new _2_Employee("Steve", 103, 35, "QA");
//    	_2_Employee e4 = new _2_Employee("John", 104, 40, "Developer");
//
//    	System.out.println("---------------------------");
//    	System.out.println(" Emp1 Name -" + e1.name + " Emp1 EmpId -" + e1.empId);
//    	System.out.println(" Emp2 Name -" + e2.name + " Emp2 EmpId -" + e2.empId);
//    	System.out.println(" Emp3 Name -" + e3.name + " Emp3 EmpId -" + e3.empId + " Emp3 Age is - " + e3.age + " Emp3 dept is - " + e3.dept );
//    	System.out.println(" Emp4 Name -" + e4.name + " Emp4 EmpId -" + e4.empId + " Emp4 Age is - " + e4.age + " Emp4 dept is - " + e4.dept );
//    	
//    	new _2_Employee();
//    	new _2_Employee(10);
//    	new _2_Employee("Test");
    	_2_Employee e5 = new _2_Employee("Pat", 107);
    	System.out.println(e5.name + " " + e5.empId);
    	
    	
    	
    	
    	
    	
    	
    	
    	
  
    }
    
    
    
    
    
    
    
}
