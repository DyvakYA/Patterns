package transactions.dao.daofactory;

import transactions.dao.GenericDao;
import transactions.dao.connection.DaoConnection;
import transactions.entity.Product;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 * Created by User on 5/25/2018.
 */
public abstract class DaoFactory {

    public abstract DaoConnection getDaoConnection();

    public abstract GenericDao<Product> createProductDao(Connection connection);

    public static final String DB_FILE = "db.properties";
    private static final String DB_FACTORY_CLASS = "factory.class";
    private static DaoFactory instance;

    public static DaoFactory getInstance() {
        if (instance == null) {
            try {
                InputStream inputStream = DaoFactory.class.getResourceAsStream(DB_FILE);
                Properties dbProps = new Properties();
                dbProps.load(inputStream);
                String factoryClass = dbProps.getProperty(DB_FACTORY_CLASS);
                instance = (DaoFactory) Class.forName(factoryClass).newInstance();
            } catch (IOException | IllegalAccessException |
                    InstantiationException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        return instance;
    }
}
