package priority_Demo;

import org.testng.annotations.Test;

public class testng_Priority_Demo {
	
	//when no priority it uses alphabetical order of method names and if mix of priority and no priority 
	//then no priority will be executed first 
	@Test(priority = 1)
	public void test1() {
		System.out.println("In test1");
	}
	
	@Test(priority = -3)
	public void test2() {
		System.out.println("In test2");		
	}
	
	@Test(priority = 2)
	public void test3() {
		System.out.println("In test3");		
	}

}
