import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Iterator;
import java.util.jar.JarException;

import javax.json.Json;
import javax.json.JsonObject;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonFormatInsertion {

   public static void main(String args[]) throws NullPointerException{  
	  
	  
	   //JSONObject jsonobj = new JSONObject();
	   
	   JSONArray jsonarr = new JSONArray();
	   int id = 0;
	String name = null,city=null,street=null,zip=null;
	int count=1;
     try{  
//step1 load the driver class  
     Class.forName("oracle.jdbc.driver.OracleDriver");  
  
//step2 create  the connection object  
         Connection con=DriverManager.getConnection(  
               "jdbc:oracle:thin:@localhost:1521:xe","sys as sysdba","Welcome123");  
  
//step3 create the statement object  
        PreparedStatement stmt=con.prepareStatement("insert into CUSTOMERS " +
                "(CUSTOMER_ID,CUSTOMER_NAME, CITY, "
                + "STREET, ZIP) " +
                "VALUES ( ?, ?, ?, ?, ? ) ");  
       
//step4 execute query  
       
        stmt.setInt(1, 680);
        stmt.setString(2, "AKHIL");
        stmt.setString(3, "GWALIOR");

        stmt.setString(4, "GWL");
        
        stmt.setString(5, "56865");

            int rs=stmt.executeUpdate();  
            
            
            
            
            System.out.println(rs);
            
          
     
  
//step5 close the connection object  
con.close();  
  
           }catch(Exception e){ System.out.println(e);}  
  
       }  
}