package Session_14.finalKeyword;

class Parent
{
	public void test1()
	{
		System.out.println("This is test method in Parent Class Test 1");
	}
	
	public void test2()
	{
		System.out.println("This is test method in Parent Class Test 2");
	}
}



public class _1_finalKeyword_2 extends Parent {
//	@Override
//	public void test1()
//	{
//		System.out.println("This is test method in Parent Class");
//	}

	public static void main(String[] args)
	{
		_1_finalKeyword_2 child = new _1_finalKeyword_2();
		child.test1();
		child.test2();
	}
}
