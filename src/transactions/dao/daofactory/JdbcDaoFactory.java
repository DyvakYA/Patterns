package transactions.dao.daofactory;

import transactions.dao.GenericDao;
import transactions.dao.JdbcProductDaoImpl;
import transactions.dao.connection.DaoConnection;
import transactions.dao.connection.JdbcDaoConnection;
import transactions.entity.Product;

import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;

/**
 * Created by User on 5/25/2018.
 */
public class JdbcDaoFactory extends DaoFactory {

    private DataSource dataSource;

    @Override
    public DaoConnection getDaoConnection() {
        try {
            InitialContext ic = new InitialContext();
            dataSource = (DataSource) ic.lookup("java:comp/env/jdbc/mydb");
            return new JdbcDaoConnection(dataSource.getConnection());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public GenericDao<Product> createProductDao(Connection connection) {
        return new JdbcProductDaoImpl(connection);
    }
}
