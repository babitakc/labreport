package jdbc javafx;
import java.sql.*;

public class JDBCConnectionDemo {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password");
            System.out.println("Database connected successfully!");
            connection.close();
        } catch (SQLException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
