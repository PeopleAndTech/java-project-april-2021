package sixthpackage;

import java.sql.*;
import java.util.ArrayList;

public class Example {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        ArrayList<String> data = getDataFromDB("select * from students;", "zipcode");

        System.out.println(data);
    }

    // based on the data provided , the method should return all the values of the column from the db

    public static ArrayList<String> getDataFromDB(String query, String columnName) throws ClassNotFoundException, SQLException {

        String username = "root";
        String password = "root1234";
        String dbName = "peoplentech";

        String url = "jdbc:mysql://localhost:3306/" + dbName + "";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        ResultSet table = statement.executeQuery(query);

        ArrayList<String> datalist = new ArrayList<>();

        while (table.next()) {
            String data = table.getString(columnName);
            datalist.add(data);
        }

        statement.close();
        connection.close();

        return datalist;
    }


}
