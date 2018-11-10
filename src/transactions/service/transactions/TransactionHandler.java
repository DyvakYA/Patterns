package transactions.service.transactions;

import transactions.dao.GenericDao;
import transactions.dao.daofactory.DaoFactory;
import transactions.entity.Product;

/**
 * Created by User on 5/27/2018.
 */
public interface TransactionHandler {

    void runInTransaction(Transaction transaction);

    void runWithOutCommit(Transaction transaction);

    GenericDao<Product> createProductDao();

    void setDaoFactory(DaoFactory daoFactory);
}
