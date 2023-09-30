package Jenkins;

import org.testng.annotations.Test;

public class DemoTest {

	@Test(groups = "smoke")
	public void demoTest()
	{
		System.out.println("demotest");
	}
	
	@Test
	public void demo2Test()
	{
		System.out.println("demo2test");
	}
}
