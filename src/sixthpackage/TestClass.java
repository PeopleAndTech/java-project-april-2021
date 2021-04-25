package sixthpackage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestClass {

    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        Connection connection = ConnectionForSql2.connectToMySqlDB();
        Statement statement = connection.createStatement();
        ResultSet table = statement.executeQuery("select * from students;");

        while (table.next()) {
            int idFromDb = table.getInt("id");
            String nameFromDb = table.getString("name");
            String stateFromDb = table.getString("state");
            String zipcodeFromDb = table.getString("zipcode");
            System.out.println(idFromDb + " " + nameFromDb + " " + stateFromDb + " " + zipcodeFromDb);
        }

        ConnectionForSql2.clearDatabase(statement, connection);
    }
}
