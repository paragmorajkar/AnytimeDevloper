package CRUDOparetion;

import java.sql.Connection;
import java.sql.DriverManager;

public class conP {
static Connection con;
	
	public static Connection creatcon() {
		try
        {
          // load driver
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			
			//create the connection
			String url="jdbc:mysql://localhost:3306/StudentDetails";
			String user="root";
			String password="Parag@1197";
			
			 con=DriverManager.getConnection(url,user,password);
 
            
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        
        }
		return con;
	}

}
