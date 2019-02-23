package com.sreenu.logging;

import org.apache.log4j.Logger;
import org.apache.log4j.MDC;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;

public class MainProgram {
	private static Logger logger = Logger.getLogger(MainProgram.class);

	public static void main(String[] args) {
		// PropertyConfigurator.configure(MainProgram.class.getClassLoader().getResourceAsStream("mylog4j.properties"));
		// DOMConfigurator.configure("path");
		logger.debug("Program started");
		try {
			int i = 10 / 0;
		} catch (ArithmeticException e) {
			logger.error("NumberFormatException occred",e);
		} catch (Exception e) {
			logger.error("Exception occred",e);
		}	
		logger.debug("Program completed");

	} 
}
