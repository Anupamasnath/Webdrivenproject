import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JUnitdemo {
	
	@Before
	public void setUp()
	{
		System.out.println("Browser opens");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test details");
	}
	
	@After
	public void teardown()
	{
		System.out.println("Browser closes");
	}

}
