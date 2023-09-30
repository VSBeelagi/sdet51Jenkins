package Jenkins;

import org.testng.annotations.Test;

public class SampleTest {
	
	@Test(groups = "regression")
	public void sample()
	{
		System.out.println("sample run");
	}

}
