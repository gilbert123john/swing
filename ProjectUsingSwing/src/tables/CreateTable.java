package tables;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "mca", "mca");
			Statement stmt = con.createStatement();
			String user = "CREATE TABLE T_USER(USERID INTEGER PRIMARY KEY,NAME VARCHAR2(20),AGE INTEGER,GENDER CHAR(1),PHONE VARCHAR2(10),PASSWORD VARCHAR2(8))";
			String qust = "CREATE TABLE T_QUST(SETNO INTEGER PRIMARY KEY,TOPIC VARCHAR2(100),Q1 VARCHAR2(100),Q2 VARCHAR2(100),Q3 VARCHAR2(100),Q4 VARCHAR2(100),Q5 VARCHAR2(100),Q6 VARCHAR2(100))";
			String report = "CREATE TABLE T_REPORT(REPORTID INTEGER PRIMARY KEY, USERID INTEGER REFERENCES T_USER(USERID),SETNO INTEGER REFERENCES T_QUST(SETNO),ANS1 VARCHAR2(100),ANS2 VARCHAR2(100),ANS3 VARCHAR2(100),ANS4 VARCHAR2(100),ANS5 VARCHAR2(100),ANS6 VARCHAR2(100))";
			stmt.executeUpdate(user);
			stmt.executeUpdate(qust);
			stmt.executeUpdate(report);
			System.out.println("Table Created");
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
