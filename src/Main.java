import java.sql.Connection;
import java.sql.DriverManager;
public class Main {
    public static void main(String[] args) throws Exception
    {
        // 1. Load and Register the MySql_Driver:
        Class.forName("com.mysql.jdbc.Driver");

        // 2. Establish the Connection with MySql Cricket_Database:
        Connection con = DriverManager.getConnection("jdbc.mysql://Localhost:3306/cricket","root","Pjj@2002");

    }
}