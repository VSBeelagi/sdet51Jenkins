package Jenkins;

import org.testng.annotations.Test;

public class JenkinTest {

	
	@Test(groups = "smoke")
	public void jenkinsTest()
	{
		System.out.println("jenkinsTest");
		
		System.out.println("Run2");
	}
}
