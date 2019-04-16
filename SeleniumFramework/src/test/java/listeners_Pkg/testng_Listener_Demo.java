package listeners_Pkg;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners_Pkg.listeners_With_Testng.class)
public class testng_Listener_Demo {
     
	@Test
	public void test1() {
    	 System.out.println("In test1");
     }
    
	@Test 
	public void test2() {
    	 System.out.println("In test2");
    	 Assert.assertTrue(false);
     }
     
	@Test
	public void test3() {
    	 System.out.println("In test3");
    	 throw new SkipException("This test3 is skipped");
     }
}
