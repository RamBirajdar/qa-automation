package testNGpractice;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class MultipleTestCaseExec {
	
	
@Test
@BeforeEach
public void testA() {
	
	Assert.assertEquals("Gmail", "Gmail");
}

@Test

public void testC() {
	
	Assert.assertEquals("Gmail", "Google");
}

@Test

public void testB() {
	
	Assert.assertEquals("Yahoo", "Yahoo");
}
}
