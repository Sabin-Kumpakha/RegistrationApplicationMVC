import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class JdbcUtil 
{
	static
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Driver is registered");
	}
	
	
	public static Connection getDBConnection() throws SQLException
	{
		String url = "jdbc:mysql://localhost:3306/sabin_db";
		String userName = "root";
		String password = "Sabin@123";
		
		return DriverManager.getConnection(url, userName, password);
	}
	
	public static void closeResource(Connection connect, PreparedStatement pstmt) throws SQLException
	{
		if(connect!=null)
			connect.close();
		if(pstmt!=null)
		    pstmt.close();
	}
}
