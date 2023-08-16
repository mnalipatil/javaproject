package Session_8;

import java.util.Scanner;

public class _1_UserInput {
	public static void main(String[] args)
	{
//		System.out.println("Please enter a factory name");
//		Scanner scanner = new Scanner(System.in);
//		String userInput = scanner.next();
//		scanner.close();
//		
//		
//		_2_UserDefinedMethods userDefinedMethods = new _2_UserDefinedMethods();
//		String factName = userDefinedMethods.factoryName(userInput);
//		System.out.println(factName);
		
//		System.out.println("Please enter a factory name");
//		
//		Scanner scanner = new Scanner(System.in);
//		String userInput = scanner.next();
//		scanner.close();
//		
//		_2_UserDefinedMethods userDefinedMethods = new _2_UserDefinedMethods();
//		String countryCapOutput = userDefinedMethods.countryCap(userInput);
//		System.out.println(countryCapOutput);
		
		System.out.println("Please enter two number for an addition");
		Scanner sc = new Scanner(System.in);
		int intOne = sc.nextInt();
		int intTwo = sc.nextInt();
		sc.close();
		
		_2_UserDefinedMethods userDefinedMethods = new _2_UserDefinedMethods();
		int total = userDefinedMethods.add(intOne, intTwo);
		System.out.println(total);
		
		
		
		
		
		
	}

}
