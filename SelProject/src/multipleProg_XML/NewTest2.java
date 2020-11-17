package multipleProg_XML;

import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest2 {
	@BeforeClass
	public void Login2() {
		System.out.println("Login2 Successful..!!");
	}
	// Post condition
	@AfterClass
	public void Logout2() {
		System.out.println("Logout2 successful..!!");
	}
	@Test(priority=3)
	public void deletevendor() {
		System.out.println(" Delete Product vendor success");
		Assert.assertEquals("Gmail", "mail");
	}
	@Test(priority=2)
	public void deleteproduct() {
		System.out.println("Delete Product added success");
	}
	@Test(priority=1)
	public void deletesearch() {
		System.out.println("Delete Product search success");
	}
}
