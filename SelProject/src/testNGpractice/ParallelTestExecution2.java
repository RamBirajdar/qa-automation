package testNGpractice;

import org.testng.annotations.Test;

public class ParallelTestExecution2 {
	@Test
	public void DeleteSearch() {
		long threadid = Thread.currentThread().getId();
		System.out.println("Current thread6 is "+ threadid);
	}
	@Test
	public void DeleteProduct() {
		long threadid = Thread.currentThread().getId();
		System.out.println("Current thread6 is "+ threadid);
	}
	@Test
	public void DeleteVendor() {
		long threadid = Thread.currentThread().getId();
		System.out.println("Current thread6 is "+ threadid);
	}
}
