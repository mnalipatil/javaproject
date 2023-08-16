package Session_14.HashMapinJava;

import java.util.HashMap;
import java.util.Map;

public class _1_HashMap {
	
	public static void main(String[] args)
	{
	//HashMap<String, String> credentials = new HashMap<String, String>();
	
	Map<String, String> credentials = new HashMap<String, String>();
	
	credentials.put("Admin", "Tom");
	credentials.put("Manager", "John");
	credentials.put("Enduser", "Steve");
	
//	System.out.println("The Size of HashMap is -> " + credentials.size());
//	
//	for(Map.Entry e : credentials.entrySet())
//	{
//		System.out.println("The key is -> " + e.getKey());
//	}
//	
//	credentials.replace("Manager", "Mark");
//	for(Map.Entry e : credentials.entrySet())
//	{
//		System.out.println("The key is -> " + e.getKey() + " " + "The Value is -> " + e.getValue());
//	}
	
	credentials.replace("Manager", "Mark");
	System.out.println("Is the current HashMap is containing any key as Enduser ?" + credentials.containsKey("Enduser"));
	System.out.println("Is the current HashMap is containing any key as Tom ?" + credentials.containsKey("Tom"));
	System.out.println("Is the current HashMap is empty" + credentials.isEmpty());
	
	credentials.remove("Enduser", "Steve");
	
	for(Map.Entry e : credentials.entrySet())
		{
			System.out.println("The key is -> " + e.getKey() + " " + "The Value is -> " + e.getValue());
		}
	
	
	
	
	
	
	
	
	
	
	
	}
	

}
