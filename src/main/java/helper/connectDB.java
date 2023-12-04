package helper;

import java.sql.Connection;
import java.sql.DriverManager;

public class connectDB {
	public static Connection getConnection() {
		Connection con = null;
		try {
			String user = "sa";
			String password = "th290403";
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url = "jdbc:sqlserver://localhost:1433;databaseName=donThuoc;integratedSecurity=true";
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
