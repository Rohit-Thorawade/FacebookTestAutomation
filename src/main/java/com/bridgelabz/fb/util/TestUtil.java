/**
 * @author Rohit Thorawade]
 * @purpose Implementing Excel File Reader 
 *
 */
package com.bridgelabz.fb.util;

import java.util.ArrayList;


public class TestUtil {
	static Xls_Reader reader;
	public static long PAGE_LOAD_TIMEOUT=30;
	public static long IMPLICIT_WAIT=25;
	
	//Login Data
	public static ArrayList<Object[]> getDataFromExcel()

	{
		ArrayList<Object[]> mydata = new ArrayList<Object[]>();

		try {
			reader = new Xls_Reader(
					"/home/admin-1/eclipse-workspace/FacebookAutomation/src/main/java/com/bridgelabz/fb/testdata/FbLoginData.xlsx");

		} catch (Exception e) {
			e.printStackTrace();
		}

		// parameterize data
		for (int rowNum = 2; rowNum <= reader.getRowCount("LoginData"); rowNum++) {
			// Reading Data
			
			String email = reader.getCellData("LoginData", "Email", rowNum);
			String password = reader.getCellData("LoginData", "Password", rowNum);

			Object[] obj = { email, password };
			mydata.add(obj);

		}

		return mydata;

	}

	
}
