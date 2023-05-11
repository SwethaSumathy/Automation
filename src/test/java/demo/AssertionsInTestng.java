package demo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsInTestng {
	
	@Test
	public void demoAssert()
	{
		
		System.out.println("Hi this is Hard Assert");
		String s1="Oranium";
		String s2="chrompet";
		
		//Assert.assertEquals(s1, s2,"Assertions are not equals");//
		Assert.assertNotEquals(s1, s2);
		System.out.println("Hard Assertions got failed");
		
		System.out.println("End of Hard Assert");
	}
	@Test
	public void demoSoft()
	{
		System.out.println("Hi this is Starting point of Soft Assert");
		String s1="Chrompet";
		String s2="Velachery";
		
		SoftAssert s = new SoftAssert();
		
		s.assertEquals(s1, s2);//
		System.out.println("Soft Assertions Ending");
		System.out.println("End of Soft Assert");
		s.assertAll();
		
	}

}
