package database;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class testdb {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		dbHandler db = new dbHandler("mysql", "localhost", 3306, "sys", "root", "root");
		
		db.loadingQuery("select * from sample");
	}
}
