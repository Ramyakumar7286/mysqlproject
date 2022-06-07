package Mysqljava;
import java.sql.*;
public class Mysqlproject {
		public static void select(){
			try
			{ 
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","EncoDing@1605");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from employee");
			
			while(rs.next())
			{
			System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));
			}
			}
			catch(Exception e)
			{
			System.out.println(e.toString());}
		}
	static void insert() {
					try{ Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","EncoDing@1605");
					Statement st=con.createStatement();
					st.executeUpdate("insert into employee values(5,roshini,project manager,120000,9)");
					con.close();
					}
					catch(Exception e)
					{
					System.out.println(e.getMessage());}
				
				}
	static void update() {
					try{ Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","EncoDing@1605");
					Statement st=con.createStatement();
					st.executeUpdate("update employee set posting='program manager' where id=2");
					con.close();
					}
					catch(Exception e)
					{
					System.out.println(e.getMessage());}
					
				}
	static void delete() {
					
					try{ Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","EncoDing@1605");
					String s="delete from employee where id=?";
					PreparedStatement ps=con.prepareStatement(s);
					ps.setInt(1,3);
					ps.execute();
					con.close();
					}
					catch(Exception e)
					{
						System.out.println(e.getMessage());}

					} 

	public static void main(String args []) {
				    int a = 4;
					switch(a) {
					case 1:
					   Mysqlproject.select();
						break;
					case 2:
						Mysqlproject.insert();
						break;
					case 3:
						Mysqlproject.update();
						break;
					case 4:
						Mysqlproject.delete();
						
						break;
					}
					
				}

}
		
	
