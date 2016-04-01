package Task012;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Ramilia Nigmatullina
 * 11-402
 * Task012
 */
public class MyConnection {
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        Connection conn = DriverManager.getConnection (
                "jdbc:postgresql://localhost:5432/Task012",
                "postgres",
                "Postgres"
        );
        return conn;
    }
}
