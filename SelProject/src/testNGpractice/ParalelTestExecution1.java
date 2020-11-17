package testNGpractice;

import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParalelTestExecution1 {
	
	
	// Pre condition
		@BeforeClass
		public void Login() {
			long threadid = Thread.currentThread().getId();
			System.out.println("Login - Current thread1 is "+ threadid);
		}
		// Post condition
		@AfterClass
		public void Logout() {
			long threadid = Thread.currentThread().getId();
			System.out.println("Logout - Current thread2 is "+ threadid);
		}
		@Test
		public void AddVendor() {
			long threadid = Thread.currentThread().getId();
			System.out.println("Current thread3 is "+ threadid);
		}
		@Test
		public void AddProduct() {
			long threadid = Thread.currentThread().getId();
			System.out.println("Current thread4 is "+ threadid);
		}
		@Test
		public void SearchProduct() {
			long threadid = Thread.currentThread().getId();
			System.out.println("Current thread5 is "+ threadid);
		}
		
	
		
		
}
