package Bus;

import java.util.ArrayList;

import Dao.CategoriesDao;
import Model.*;

public class CategoriesBus {
	CategoriesDao CategoriesDao = new CategoriesDao();
	
	public ArrayList<Categories> getAllCategories() {
		return CategoriesDao.getAllCategories();
	}
}
