package Session_13.encapsulation;

public class _2_TestCompany {

	public static void main(String[] args)
	{
		_1_Company comp = new _1_Company();
		
//		System.out.println(comp.name);
//		System.out.println(comp.EmpCount);
//		System.out.println(comp.logo);
//		System.out.println(comp.searchEngine);
//		System.out.println(comp.revenue);
		
		comp.setName("Alphabet Corp");
		System.out.println(comp.name);
		System.out.println(comp.getName());
		
		comp.setlogo("https://www.alphabet.com/logo");
		System.out.println(comp.logo);
		System.out.println(comp.getLogo());
		
		comp.setEmpCount(1000);
		System.out.println("ompany Emp count is ->");
		System.out.println(comp.EmpCount);
		System.out.println(comp.getEmpCount());
		
		comp.setSearchEngine("Google");
		System.out.println("company is using search engine as ->" );
		System.out.println(comp.getSearchEngine());
		
		comp.setRevenue(1_00_00_000); // 10000000
		System.out.println("company revenue is ->");
		System.out.println(comp.getRevenue());
		
	}
}
