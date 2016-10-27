package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;





public class ConDBl {
   //public static final String DBDRIVER ="org.git.mm.mysql.Driver";
	public static final String DBDRIVER ="com.mysql.jdbc.Driver";
    public static final String DBURL ="jdbc:mysql://localhost:3306/javaweb";
    
    public static final String DBUSER ="xgqfrms";
    
    public static final String DBPWD ="xgq2015";
    
    
	
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(DBDRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			conn = DriverManager.getConnection(DBURL,DBUSER,DBPWD);
			String sql = "SELECT id,username,pwd FROM admin";
			stmt = conn.createStatement();
	        rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int id =rs.getInt("id");
				String name =rs.getString("username");
				String pass =rs.getString("pwd");
				
				System.out.println(""+id+"   "+name+"   "+pass+"");
				
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(conn);
		
		try {                        //finally？？？
			rs.close();
			stmt.close();
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
