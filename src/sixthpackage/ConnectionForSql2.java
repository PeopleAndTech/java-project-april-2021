package sixthpackage;

import fourthpackage.PropertiesFileUtils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionForSql2 {

    public static Connection connectToMySqlDB() throws IOException, SQLException, ClassNotFoundException {
        String username = PropertiesFileUtils.getDataFromPropertiesFile("src/sixthpackage/config.properties", "username");
        String password = PropertiesFileUtils.getDataFromPropertiesFile("src/sixthpackage/config.properties", "password");
        String dbName = PropertiesFileUtils.getDataFromPropertiesFile("src/sixthpackage/config.properties", "dbName");

        String url = "jdbc:mysql://localhost:3306/" + dbName + "";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, username, password);
        return connection;
    }


  /*  public static ResultSet getTableDataFromDB(String query) throws SQLException, IOException, ClassNotFoundException {
        Connection connection = connectToMySqlDB();
        Statement statement = connection.createStatement();
        ResultSet table = statement.executeQuery(query);
        return table;
    }*/


    public static void clearDatabase(Statement statement, Connection connection) throws SQLException {
        if (statement != null) {
            statement.close();
        }

        if (connection != null) {
            connection.close();
        }
    }
}
