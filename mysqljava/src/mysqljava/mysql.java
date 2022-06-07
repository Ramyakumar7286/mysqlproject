package mysqljava;
import java.sql.*;
public class mysql 
{
public static void main(String[] args)
{
		try
		{ 
			Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/operation","root","EncoDing@1605");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from operation");
		while(rs.next())
		{
		System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
		}
		}
		catch(Exception e)
		{
		System.out.println(e.toString());
		}
	}
}

	


