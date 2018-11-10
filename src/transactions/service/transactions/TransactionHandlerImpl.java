package transactions.service.transactions;

import transactions.dao.GenericDao;
import transactions.dao.connection.DaoConnection;
import transactions.dao.daofactory.DaoFactory;
import transactions.entity.Product;
import transactions.service.transactions.exceptions.TransactionException;

import java.sql.Connection;

public class TransactionHandlerImpl implements TransactionHandler {

    private DaoFactory daoFactory = DaoFactory.getInstance();

    private static class Holder {
        static final TransactionHandlerImpl INSTANCE = new TransactionHandlerImpl();
    }

    public static TransactionHandlerImpl getInstance() {
        return Holder.INSTANCE;
    }


    public void runInTransaction(Transaction transaction) {
        try (DaoConnection dbConnection = daoFactory.getDaoConnection()) {
            dbConnection.beginTransaction();
            transaction.execute(dbConnection);
            dbConnection.commitTransaction();
        } catch (Exception e) {
            throw new TransactionException(e);
        }
    }

    public void runWithOutCommit(Transaction transaction) {
        try {
            try (DaoConnection dbConnection = daoFactory.getDaoConnection()) {
                dbConnection.beginTransaction();
                transaction.execute(dbConnection);
                dbConnection.commitTransaction();
            }
        } catch (Exception e) {
            throw new TransactionException(e);
        }
    }

    public GenericDao<Product> createProductDao() {
        DaoConnection daoConnection = daoFactory.getDaoConnection();
        Connection connection = daoConnection.getConnection();
        return daoFactory.createProductDao(connection);
    }

    public void setDaoFactory(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

}
