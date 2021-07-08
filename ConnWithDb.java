
//package payroll_system;
import java.sql.*;  // it has all the commands like update
// conn class is used for making connection 
public class ConnWithDb {
    // interfaces
    public Connection c; // connection between java application and database
    public Statement s; // quires execution
    // constuctor
    public ConnWithDb(){
        try{
            Class.forName("com.mysql.jdbc.Driver"); // mysql drivers are getting registered
            // this is the url, project 2 is the name of the database, root is the username in mysql, password in mysql(have to fill) 
            c = DriverManager.getConnection ("jdbc:mysql:///ABC","root","Sanjana23@");
            s = c.createStatement();  // creation of the statement
            
        
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
 // try and catch :- exceptions are of two types 
// checked exception - which the complier alredy knows eg arithemitic exception(5/0)
// unchecked exception - external file to attach with code -- like in this we have attached database