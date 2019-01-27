import java.sql.DriverManager;
import java.sql.*;
public class JDBCexample{
    public static void main(String[] args) throws SQLException
    {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test");
        System.out.println("Conectado");
        con.close();
    }
}