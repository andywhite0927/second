package org.selenium.common;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

public class CurrentWebDriver {
	
	private static WebDriver webDriver;
	private static Map<String, Object> storedVars = new HashMap<String, Object>();
	private static long delyWait = 10;
	private static final Date dateDebutSession = Calendar.getInstance().getTime();
	

}
