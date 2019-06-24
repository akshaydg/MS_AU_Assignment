package com.learning.designpatterns;


public class ReverseString {
	Logger logger = Logger.getLogger();
	
	public void reverseString(String str) {
		StringBuilder strb = new StringBuilder();
		strb.append(str);
		strb=strb.reverse();
		logger.setLogFile("C:\\Users\\akshay.gaikwad\\Documents\\MyWork\\log.txt");
		logger.log("Previous string "+str);
		logger.log("After reversing...");
		logger.log(strb.toString());
		
	}

}
