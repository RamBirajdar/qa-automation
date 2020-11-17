package multipleProg_XML;

import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
	// Pre condition
	@BeforeClass
	public void Login() {
		System.out.println("Login Successful..!!");
	}
	// Post condition
	@AfterClass
	public void Logout() {
		System.out.println("Logout successful..!!");
	}
	@Test(priority=3)
	public void AddVendor() {
		System.out.println("Product vendor success");
		Assert.assertEquals("Gmail", "mail");
	}
	@Test(priority=2)
	public void AddProduct() {
		System.out.println("Product added success");
	}
	@Test(priority=1)
	public void SearchProduct() {
		System.out.println("Product search success");
	}
}
