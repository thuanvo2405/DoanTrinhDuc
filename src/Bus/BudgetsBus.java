package Bus;

import java.util.ArrayList;

import Dao.BudgetsDao;
import Model.*;

public class BudgetsBus {
	BudgetsDao BudgetsDao = new BudgetsDao();
	
	public ArrayList<Budgets> getAllCategories() {
		return BudgetsDao.getAllBudget();
	}
}
