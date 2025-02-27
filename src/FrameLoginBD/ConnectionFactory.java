package frameloginbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private final String url = "jdbc:mysql://localhost/sakila",
            usr = "root",
            pwd = "1234";
    
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, usr, pwd);
    }
}
