package Session_6;

import java.util.ArrayList;

public class _4_ArrayListObjType {
	
	public static void main(String[] args)
	{
		ArrayList<Object> empInfo = new ArrayList<Object>();
		empInfo.add("Tom");
		empInfo.add("m");
		empInfo.add(499.99);
		empInfo.add(true);
		
		System.out.println(empInfo.get(2));
		
		for(int i=0; i<empInfo.size(); i++)
		{
			System.out.println(empInfo.get(i));
		}
		
		empInfo.clear();
		System.out.println(empInfo.size());
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
