
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

public class JsonFormatmysql {

   public static void main(String args[]) throws NullPointerException{  
	  
	  
	   //JSONObject jsonobj = new JSONObject();
	   
	   JSONArray jsonarr = new JSONArray();
	   
	int PersonID = 0;
	String LastName=null,FirstName=null,Address=null,City=null;
	int count=1;
     try{  
//step1 load the driver class  
     Class.forName("com.mysql.jdbc.Driver");  
  
//step2 create  the connection object  
         Connection con=DriverManager.getConnection(  
               "jdbc:mysql://localhost:3306/mydatabase","root","Welcome123");  
  
//step3 create the statement object  
        Statement stmt=con.createStatement();  
       System.out.println("connection done!!");
//step4 execute query  
            ResultSet rs=stmt.executeQuery("select PersonID , LastName , FirstName , Address , City from persons");  
            
            while(rs.next()) {
            	
            	PersonID=rs.getInt(1);
            	LastName=rs.getString(2);
            	FirstName=rs.getString(3);
            	Address=rs.getString(4);
            	City=rs.getString(5);
            
            JSONObject jsonobj = new JSONObject();
            jsonobj.put("PersonID", PersonID);
            jsonobj.put("LastName", LastName);
            jsonobj.put("FirstName", FirstName);
            
           JSONObject address = new JSONObject(); 
           
           address.put("Address", Address);
           address.put("City", City);
           
            
            
            jsonobj.put("address", address);
            
            jsonarr.put(jsonobj);
            
            }
            
            System.out.println(jsonarr);
            
          
     
  
//step5 close the connection object  
con.close();  
  
           }catch(Exception e){ System.out.println(e);}  
  
       }  
}