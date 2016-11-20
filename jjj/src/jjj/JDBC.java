package jjj;

import java.sql.*;

public class JDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	Class.forName("org.h2.driver");
	Connection conn= DriverManager.getConnection("jdbc:h2:~/test","sa","");
	Statement stmt=conn.createStatement();
	ResultSet rs=stmt.executeQuery("select*from Product");
	while(rs.next())
	{
		System.out.println(rs.getInt(1)+"");
		System.out.println(rs.getString(2));
		
	}
}
	}
}

	

