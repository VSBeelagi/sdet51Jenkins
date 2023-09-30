package Jenkins;

import org.testng.annotations.Test;

public class SampleTest {
	
	@Test(groups = "regression")
	public void sample()
	{
		System.out.println("sample run");
	}

	@Test(groups = "smoke")
	public void sample2()
	{
		System.out.println("sample run-2");
	}
}
