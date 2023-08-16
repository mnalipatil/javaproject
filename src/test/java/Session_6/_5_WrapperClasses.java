package Session_6;

public class _5_WrapperClasses {
	
	public static void main(String[] args)
	{
		
		//String to integer
		
//		String x = "100";
//  	System.out.println(x+10); // 10010 -> 110
//		
//		int i = Integer.parseInt(x);
//		
//		System.out.println(i+10);
		
		// Integer to String
//		int q = 10;
//		System.out.println(q+5); // 10+5 = 15 ->105
//		
//		String s = String.valueOf(q); // "10"
//		
//		System.out.println(s+5); // 105
//		
//		// String to Double
//		
//		String b = "12.33";
//		System.out.println(b+10);
//		
//		double d = Double.parseDouble(b);
//		
//		System.out.println(d+10);
		
//		String amount1 = "$435";
//		
//		String tmp = amount1.replace("$", "");
//		
//		int temp1 = Integer.parseInt(amount1);
//		
//		System.out.println(temp1+20);
		
//		String amount2 = "$345/-";
////		String tmp1 = amount2.replace("$", "");
////		String tmp2 = tmp1.replace("/-", "");
////		int temp2 = Integer.parseInt(tmp2);
////		System.out.println(temp2+30);
////		
//		String tmp1 = amount2.substring(1,3);
//		
//		System.out.println(tmp1);
//		
//		int temp3 = Integer.parseInt(tmp1);
//		
//		System.out.println(temp3+50);
		
		String amount = "$4,456,89/-";
		
		String tmp3 = amount.replaceAll("[^0-9]", ""); // 445689
		
		int f = Integer.parseInt(tmp3);
		System.out.println(f+60);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
