import java.sql.Connection;
import java.sql.DriverManager;

class DBConnection {

    static Connection getConnection() {

        try {

            String url =
                    "jdbc:mysql://localhost:3306/busdb";

            String username = "root";

            String password = "root123";

            Connection con =
                    DriverManager.getConnection(
                            url,
                            username,
                            password
                    );

            System.out.println(
                    "Database Connected Successfully");

            return con;

        } catch (Exception e) {

            System.out.println(e);

            return null;
        }
    }
}