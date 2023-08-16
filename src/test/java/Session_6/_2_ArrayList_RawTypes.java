package Session_6;

import java.util.ArrayList;

public class _2_ArrayList_RawTypes {
	
	public static void main(String[] args)
	{
		
		ArrayList ar = new ArrayList();
		
//		System.out.println(ar.size());
//		int sizeOfArrayList = ar.size();
//		System.out.println(sizeOfArrayList);
		
		ar.add(100); // 0
		ar.add(200); // 1
		ar.add(300); // 2
		
//		System.out.println(ar.size());
		
		ar.add(400); // 3
		ar.add("test"); // 4
		
//		System.out.println(ar.size());
//		
//		System.out.println(ar.get(3));
//		for(int i=0; i<ar.size(); i++)
//		{
//			System.out.println(ar.get(i));
//		}
		
//		ar.remove(2);
//		ar.remove(0);
		
//       for (int i=0; i<ar.size(); i++)
//		{
//			System.out.println(ar.get(i));
//		}
		
		 for (int i=0; i<ar.size(); i++)
			{
				if(ar.get(i).equals("test"))
					{
					System.out.println("At Index number " + i + ". " +ar.get(i));
					}
				
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
