package creational.objectPool.sample1;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
        // Do something

        // Create the ConnectionPool
        JDBCConnectionPool pool = new JDBCConnectionPool(
                "org.hsqldb.jdbcDriver", "jdbc:hsqldb://localhost/mydb",
                "admin", "admin");

        // Get a connection
        Connection conn = pool.checkOut();

        // Use the connection

        // Return the connection
        pool.checkIn(conn);
    }
}
