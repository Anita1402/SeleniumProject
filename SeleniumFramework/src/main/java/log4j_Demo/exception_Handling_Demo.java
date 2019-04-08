package log4j_Demo;

public class exception_Handling_Demo {

	public static void main(String[] args) {
		try {
		exp_Handle1();
		}
		catch (Exception e) {
			System.out.println("go an exception");
			System.out.println("msg is " + e.getMessage());
			System.out.println("cause is " + e.getCause());
			e.printStackTrace();
		}
		finally {
			System.out.println("In finally bock");
		}

	}
	
	
	public static void exp_Handle1() throws Exception {
		System.out.println("Hello");
		int i = 1/0;
		System.out.println("Complete");
	
	}
	
/*	public static void exp_handle(){
		try {
			System.out.println("Hello");
			int i = 1/0;
			System.out.println("Complete");
			
		}
		catch (Exception e) {
			System.out.println("go an exception");
			System.out.println("msg is " + e.getMessage());
			System.out.println("cause is " + e.getCause());
			e.printStackTrace();
		}
		finally {
			System.out.println("In finally bock");
		}
	} */

}
