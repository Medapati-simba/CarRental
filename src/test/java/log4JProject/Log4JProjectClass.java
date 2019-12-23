package log4JProject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4JProjectClass {
	
	private static Logger log = LogManager.getLogger(Log4JProjectClass.class.getName());
	
	
		public static void main(String[] args ) {

			log.debug("This is a debug message");
			log.info("This is a info message");
			log.error("This is a eror message");
			log.fatal("This is a fatal message ");
			System.out.println("hello");
		}
	

}
