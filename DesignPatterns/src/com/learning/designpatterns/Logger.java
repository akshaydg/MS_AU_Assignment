package com.learning.designpatterns;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {
	
	private static Logger logger=null;
	private PrintWriter writer = null;
	
	private Logger() {
		
	}
	
	public void setLogFile(String fileName) {
		try {
			writer= new PrintWriter(new FileWriter(fileName),true);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public void log(String msg) {
		try {
			System.out.println(msg);
			writer.println(msg);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Logger getLogger() {
		
		if(logger==null) {
			synchronized(Logger.class) {
				logger=new Logger();
			}
		}
		return logger;
		
	}

}
