import java.util.*;
public class crudoperation
        public static void main(String[] args)
        {
		Scanner sc=new Scanner(System.in);
		String dataInput = sc.nextLine();
	     switch(dataInput)
		{
		case "1":
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
		}
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee"+"ramyadb1","root","EncoDing@1605");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from ramyadb1");
		while(rs.next())
		{
		System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
		}
		}
		catch(Exception e)
		{
		System.out.println(e.toString());
		}
        break;
		case "2":
			
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
			}
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee"
				+ "ramyadb1","root","EncoDing@1605");
		Statement st1=con.createStatement();
		String str1 ="Employee_ID,Employee_NAME,Employee_POST,Employee_SALARY,Employee_EXPERIENCE";
		ResultSet rs=st1.executeQuery("insert into userid values('" +str1+ "', '" +str1+
				"', '" +str1+ "','"+str1+"','" +str1+"')");
		   
        }
