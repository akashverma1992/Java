package demo_sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class SQLConnection {
    protected SQLConnection() {
    }

    public static void main(String[] a) {
        Connection con = null;
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/aakash?";
        Properties props = new Properties();
        props.put("user", "root");
        props.put("password", "root");
        try {
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url, props);
            System.out.println("\n" + con + "\n");
            con.close();
        } catch (ClassNotFoundException | SQLException | IllegalAccessException | InstantiationException ex) {
            ex.printStackTrace();
        }
    }
}
