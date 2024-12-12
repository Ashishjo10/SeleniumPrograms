package testNgPGM;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterisation 
{
    @Parameters("s")
	@Test
	public void paraMtr(String s)
	{
		System.out.println("Paramter value="+s);
	}
}
