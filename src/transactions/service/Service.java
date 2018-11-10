package transactions.service;

import transactions.entity.Product;
import transactions.service.transactions.TransactionHandler;

/**
 * Created by User on 5/19/2018.
 */
public interface Service {

    void create(Product product);

    void update(Product product);

    void delete(long id);

    void setTransactionHandler(TransactionHandler transactionHandler);
}
