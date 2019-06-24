package com.learning.designpatterns;

import java.util.Scanner;

public class LoggerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String str=input.nextLine();
		Logger logger = Logger.getLogger();
		logger.setLogFile("C:\\Users\\akshay.gaikwad\\Documents\\MyWork\\log.txt");
		ReverseString rev = new ReverseString();
		rev.reverseString(str);
		input.close();
	}

}
