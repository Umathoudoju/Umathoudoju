import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Serverconnection {
	static String myDriver="com.mysql.jdbc.Driver";
   
  
    public static void main(String[] args) throws ClassNotFoundException {
    	
    	Class.forName(myDriver);
        if (isDatabaseConnected()) {
        	 
            System.out.println("Database connection successful.");
        } else {
            System.out.println("Failed to connect to the database.");
        }
    }

    public static boolean isDatabaseConnected() {
    	String DB_URL = "jdbc:mysql://localhost:3306/db?characterEncoding=utf8";
	    String USERNAME = "root";
	    String PASSWORD = "uma@12345";
        try 
        {
        	String QUERY="select * from Persons";
        
        	Connection connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
        	Statement stat=connection.createStatement();
        	ResultSet rs = stat.executeQuery(QUERY);
         		      
           while(rs.next()){
              //Display values
              System.out.print("ID: " + rs.getInt(1));
              System.out.print(", First: " + rs.getString(2));
              System.out.println(", Last: " + rs.getString(3));
           }
            return true;
        }
        catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}