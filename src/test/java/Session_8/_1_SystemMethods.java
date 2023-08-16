package Session_8;

import java.util.ArrayList;

public class _1_SystemMethods {
	
	static String welcomeMsg = "      Hello everyone How are you?     ";
	
	public static void main(String[] args)
	{
		System.out.println(welcomeMsg.length());
		System.out.println(welcomeMsg.trim());
		
		ArrayList<Integer> tableofeleven = new ArrayList<Integer>();
		tableofeleven.add(11);
		tableofeleven.add(22);
		tableofeleven.add(33);
		tableofeleven.add(44);
		tableofeleven.add(55);
		
		for(int i=0; i<tableofeleven.size(); i++)
		{
			System.out.println(tableofeleven.get(i));
		}
		
		tableofeleven.remove(2);
		
		for(int i=0; i<tableofeleven.size(); i++)
		{
			System.out.println(tableofeleven.get(i));
		}
		
		
		
	}
	

}
