/*
 * This class use for provide database connection ,query , insert and update data.
 * The function such as dbQuery,dbInsert,dbUpdate.
 * Created by Mr.Chatpong Duangbung : chatpong@gmail.com
 */

package org.pdes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnect {
	
	// Initiate Database Configuration
	String dbClass = "com.mysql.jdbc.Driver";
	String dbUser = "root";
	String dbPass = "1234";
	String dbName = "projecthl7";
	String dbUrl = "jdbc:mysql://localhost/"+dbName+"";

	public ResultSet dbQuery(String query){
		ResultSet rs = null;
		
		PatientDataExchange obj = new PatientDataExchange();
		
		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection (dbUrl,dbUser,dbPass);
			
			Statement stmt = con.createStatement();
			
			rs = stmt.executeQuery(query);
			
			//con.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		return rs;
	}
	
	public String dbInsert(String query){
		// This function use for insert or update the Database
		
		String returnMSG = "";
		
		PatientDataExchange obj = new PatientDataExchange();
		
		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection (dbUrl,dbUser,dbPass);
			
			Statement stmt = con.createStatement();
			
			//rs = stmt.executeQuery(query);
			
			//con.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		return returnMSG;
	}
	
}
