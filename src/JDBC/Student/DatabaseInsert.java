package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DatabaseInsert {
    static Connection connection = null;
    private String sql = "INSET INTO student (`sname`, `sdob`, `stream`) VALUES(?, ?, ?) ";
    public static void main(String[] args) {
        try{
            UtilJDBC utilJDBC = new UtilJDBC();
            connection = utilJDBC.databaseConnection();
            PreparedStatement preparedStatement =
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
