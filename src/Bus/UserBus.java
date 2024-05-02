package Bus;

import java.util.ArrayList;

import Model.*;
import Dao.UserDao;

public class UserBus {
	UserDao UserDao = new UserDao();
	
	public ArrayList<User> getAllUser() {
		return UserDao.getAllUser();
	}
	
	public int DangNhap(String emailUser,String pass) {
		return UserDao.DangNhap(emailUser,pass);
	}
	
	public int DangKy(String name,String emailUser,String pass) {
		return UserDao.DangKy(name,emailUser,pass);
	}
}
