package tables;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertData {

	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "mca", "mca");
			Statement stmt = con.createStatement();
			String user1 = "INSERT INTO T_USER VALUES(1001,'USER',24,'M','9895179757','PASSWORD')";
			stmt.executeUpdate(user1);
			System.out.println("1 ROW INSERTED");
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
