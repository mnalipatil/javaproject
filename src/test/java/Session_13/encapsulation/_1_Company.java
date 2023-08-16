package Session_13.encapsulation;

public class _1_Company {
	
	public String name;
	public String logo;
	public int EmpCount;
	private String searchEngine;
	private int revenue;
	
	// Getter and Setter
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getLogo()
	{
		return logo;
	}
	
	public void setlogo(String logo)
	{
		this.logo = logo;
	}

	public int getEmpCount()
	{
		return EmpCount;
	}
	
	public void setEmpCount(int EmpCount)
	{
		int addMoreEmp = 10 + EmpCount;
		EmpCount = addMoreEmp ;
	}
	
	public String getSearchEngine()
	{
		return searchEngine;
	}
	
	public void setSearchEngine(String searchEngine)
	{
		this.searchEngine = searchEngine ;
	}
	
	public int getRevenue()
	{
		return revenue;
	}
	
	public void setRevenue(int rev)
	{
		int revToPublic = rev - 1000;
		this.revenue = revToPublic ;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
