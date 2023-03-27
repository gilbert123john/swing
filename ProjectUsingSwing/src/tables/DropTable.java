package tables;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DropTable {

	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "mca", "mca");
			Statement stmt = con.createStatement();
			String dropReport = "drop table t_report";
			String dropQust = "drop table t_qust";
			String dropUser = "drop table t_user";
			stmt.executeUpdate(dropReport);
			stmt.executeUpdate(dropQust);
			stmt.executeUpdate(dropUser);
			System.out.println("Table Droped");
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
