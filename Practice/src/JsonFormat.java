import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Iterator;
import java.util.jar.JarException;

import javax.json.Json;
import javax.json.JsonObject;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonFormat {

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
        Statement stmt=con.createStatement();  
       System.out.println("connection done!!");
//step4 execute query  
            ResultSet rs=stmt.executeQuery("select customer_id , customer_name , city , street , zip from customers");  
            
            while(rs.next()) {
            	
            id=rs.getInt(1);
            name=rs.getString(2);
            city=rs.getString(3);
            street=rs.getString(4);
            zip=rs.getString(5);
            
            JSONObject jsonobj = new JSONObject();
            jsonobj.put("id", id);
            jsonobj.put("name", name);
            
           JSONObject address = new JSONObject(); 
           
           address.put("city", city);
           address.put("street", street);
           address.put("zip", zip);
            
            
            jsonobj.put("address", address);
            
            jsonarr.put(jsonobj);
            
            }
            
            System.out.println(jsonarr);
            
          
     
  
//step5 close the connection object  
con.close();  
  
           }catch(Exception e){ System.out.println(e);}  
  
       }  
}