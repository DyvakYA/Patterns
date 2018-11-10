package transactions.service;

import transactions.entity.Product;
import transactions.service.transactions.TransactionHandler;
import transactions.service.transactions.TransactionHandlerImpl;

/**
 * Created by User on 5/19/2018.
 */
public class ServiceImpl implements Service {

    private TransactionHandler transactionHandler = TransactionHandlerImpl.getInstance();

    private static class Holder {
        static final ServiceImpl INSTANCE = new ServiceImpl();
    }

    public static ServiceImpl getInstance() {
        return Holder.INSTANCE;
    }

    @Override
    public void create(Product product) {
        transactionHandler.runInTransaction(connection -> {
            transactionHandler
                    .createProductDao()
                    .create(product);
        });
    }

    @Override
    public void update(Product product) {
        transactionHandler.runInTransaction(connection -> {
            transactionHandler
                    .createProductDao()
                    .update(product);
        });
    }

    @Override
    public void delete(long id) {
        transactionHandler.runWithOutCommit(connection -> {
            transactionHandler
                    .createProductDao()
                    .delete(id);
        });
    }

    public void setTransactionHandler(TransactionHandler transactionHandler) {
        this.transactionHandler = transactionHandler;
    }

}
