package log4j_Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class demo_Log4j {

	//Creating a logger for the demo_Log4j class
	 private static Logger logger = LogManager.getLogger(demo_Log4j.class);
	
	public static void main(String[] args) {

		System.out.println("\n Hello World...! \n");
		
		logger.trace("This is trace msg");
		logger.info("This is info msg");
		logger.error("This is error msg");
		logger.warn("This is warning msg");
		logger.fatal("This is fatal msg");
		
		System.out.println("\n Completed \n");
		

	}

}
