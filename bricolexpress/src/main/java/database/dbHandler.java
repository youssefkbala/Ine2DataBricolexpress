package database;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

public class dbHandler {
	private String link;
	private String user;
	private String pwd;
	private ArrayList <value> listValeurs = new ArrayList<value>();
	//private Properties properties; 


	public dbHandler(String protocol, String addr, int port, String dbName,String user,String pwd) throws IOException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//this.properties.load(dbHandler.class.getClassLoader().getResourceAsStream("application.properties"));
		this.user = user;
		this.pwd = pwd;
		this.link = "jdbc:" + protocol + "://" + addr + ":" + port + "/" + dbName;
		
	}
	public void loadingQuery(String query) {
		try {
			
			Connection conn = DriverManager.getConnection(this.link, this.user, this.pwd);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			//value val = new value();
			int i = 0;
			while (rs.next())
			{
				value val = new value();
				val.setId(rs.getInt("id"));
				val.setFirst_name(rs.getString("first_name"));
				val.setCurrency(rs.getString("currency"));
				val.setGender(rs.getString("gender"));
				val.setLanguage(rs.getString("language"));
				
				listValeurs.add(val);
				System.out.println(listValeurs.get(i).getId());
				i++;
				//val = null;
			}
			
			for(int j = 0; j < 100; j++) {
				System.out.println(listValeurs);
			}
			conn.close();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}