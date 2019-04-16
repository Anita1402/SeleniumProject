package listeners_Pkg;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//removing the below annotation as this is added in the testng1.xml file
//@Listeners(listeners_Pkg.listeners_With_Testng.class)
public class testng_Listener_Demo2 {
     
	@Test
	public void test4() {
    	 System.out.println("In test4");
     }
    
	@Test 
	public void test5() {
    	 System.out.println("In test5");
     }
     
	@Test
	public void test6() {
    	 System.out.println("In test6");
    	 throw new SkipException("This test3 is skipped");
     }
}
