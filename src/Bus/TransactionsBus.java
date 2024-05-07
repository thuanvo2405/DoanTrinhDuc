package Bus;

import java.util.ArrayList;

import Dao.TransactionsDao;
import Model.*;

public class TransactionsBus {
	TransactionsDao TransactionDao = new TransactionsDao();
	
	public ArrayList<Transactions> getAllTransaction() {
		return TransactionDao.getAllTransaction();
	}
}
