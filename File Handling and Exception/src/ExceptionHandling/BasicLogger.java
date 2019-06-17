package ExceptionHandling;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
public class BasicLogger {

	public static void main(String[] args) throws IOException {
		Logger logger = Logger.getLogger("loggertest.BasicLogging");
		FileHandler fh;  

		   try {  

		       // This block configure the logger with handler and formatter  
		       fh = new FileHandler("C:\\Users\\akshay.gaikwad\\eclipse-workspace/MyLogFile.log",true);  
		       logger.addHandler(fh);
		       SimpleFormatter formatter = new SimpleFormatter();  
		       fh.setFormatter(formatter);  

		       // the following statement is used to log any messages  
		       logger.info("My first log");  

		   } catch (SecurityException e) {  
		       e.printStackTrace();  
		   } catch (IOException e) {  
		       e.printStackTrace();  
		   }  

		       
		        
		       logger.severe("severe message");

		       logger.warning("warning message");

		       logger.info("info message");

		       logger.config("config message");

		       logger.fine("fine message");

		       logger.finer("finer message");

		       logger.finest("finest message");
		}


}