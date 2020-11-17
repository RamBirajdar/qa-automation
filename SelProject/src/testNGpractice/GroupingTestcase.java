package testNGpractice;

import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GroupingTestcase {
  
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
	@Test(groups = {"sanity","regression"},priority=2)
	public void AddVendor() {
		System.out.println("Product vendor success");
		Assert.assertEquals("Gmail", "mail");
	}
	@Test(groups = {"sanity"},priority=3)
	public void AddProduct() {
		System.out.println("Product added success");
	}
	@Test(groups = {"sanity"},priority=4)
	public void SearchProduct() {
		System.out.println("Product search success");
	}
	
	
	
	@Test(groups = {"regression"},priority=7)
	public void DeleteSearch() {
		System.out.println("Delete search success");
	}
	@Test(groups = {"sanity","regression"},priority=8)
	public void DeleteProduct() {
		System.out.println("Delete Product success");
	}
	@Test(groups = {"regression"},priority=9)
	public void DeleteVendor() {
		System.out.println("Delete Vendor success");
	}
	
	
	
	@Test(groups = {"regression"},priority=5)
	public void FundTransfer() {
		System.out.println("Fund transfer success");
	}
	@Test(groups = {"regression"},priority=6)
	public void BillPaid() {
		System.out.println("Bill paid success");
	}
	@Test(groups = {"sanity","regression"},priority=1)
	public void BillDueexpire() {
		System.out.println("Bill due date expire");
	}
	
	
}
