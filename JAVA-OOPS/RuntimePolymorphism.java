
class Test {

	public void method()
	{
		System.out.println("Method 1");
	}
}

public class runtimePolymorphism extends Test {

	public void method()
	{
		System.out.println("Method 2");
	}

	public static void main(String args[])
	{
		Test test = new runtimePolymorphism();

		test.method();
	}
}
