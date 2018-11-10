package transactions.service.transactions;

import transactions.dao.connection.DaoConnection;

@FunctionalInterface
public interface Transaction {

    void execute(DaoConnection connection);

}