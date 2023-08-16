package Session_14;

public class _1_Company {
	
	
	protected int revenue = 50_000;
	protected String ceoName = "Mr.Thomas";
	 String companyBranchName = "Unicorn System Berlin";
	public int employeeCount = 300;
	
	
	public static void main(String[] args)
	{
		_1_Company comp = new _1_Company();
		
		System.out.println("Comp Rev -> " + comp.revenue);
		System.out.println("Comp CEO Name -> " + comp.ceoName);
		System.out.println("Comp BranchName -> " + comp.companyBranchName);
		System.out.println("Comp Employee count -> " + comp.employeeCount);
	}

}
