import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Model 
{	
	//private constructors
	private String uname;
	private String email;
	private String upassword;
	private String ucity;
	
	private Connection connect = null;
	private PreparedStatement pstmt = null;
	private int rowAffected;
	
	//getters
	public String getUname() {
		return uname;
	}
	
	//setters
	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	public String getUcity() {
		return ucity;
	}
	public void setUcity(String ucity) {
		this.ucity = ucity;
	}
	
	// method
	public int register() 
	{
		try {
			connect = JdbcUtil.getDBConnection();
			String sqlQuery = "insert into users (uname, email, upassword, ucity) values(?,?,?,?)";
			pstmt = connect.prepareStatement(sqlQuery);
			pstmt.setString(1, uname);
			pstmt.setString(2, email);
			pstmt.setString(3, upassword);
			pstmt.setString(4, ucity);
			
			rowAffected = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally 
		{
			try {
				JdbcUtil.closeResource(connect, pstmt);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return rowAffected;
		
	}
}
