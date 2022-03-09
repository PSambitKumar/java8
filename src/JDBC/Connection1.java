package JDBC;

import java.sql.DriverManager;
import java.sql.Connection;


public class Connection1 {
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/spring","root","");
            System.out.println("Database Connection Successful " + con);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
