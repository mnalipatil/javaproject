package Session_14.Test;

import Session_14._1_Company;

public class _3_TestCompany_2  extends _1_Company {
	
	// for protected
	public String changeCeoName()
	{
		ceoName = " Mr. Tom";
		return ceoName;
	}
	
	// for default
//	public String changeCompanyBranch()
//	{
//		companyBranchName = "Unicorn Sys NYC"; 
//		return companyBranchName;
//	}
//	
	
//	// for private
//	public void changeRevenueOfCompany()
//	{
//		revenue = 10_000;
//	}
	
	// for public
	public int changeEmployeeCountOfComp()
	{
		employeeCount = 250;
		return employeeCount;
	}
	
	public static void main(String[] args)
	{
		_3_TestCompany_2 comp = new _3_TestCompany_2();
		System.out.println(comp.changeCeoName());	
		System.out.println(comp.changeEmployeeCountOfComp());
	}
	

}
