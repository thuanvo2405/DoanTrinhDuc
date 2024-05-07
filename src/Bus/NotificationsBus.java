package Bus;

import java.util.ArrayList;

import Dao.NotificationsDao;
import Model.*;

public class NotificationsBus {
	NotificationsDao NotificationDao = new NotificationsDao();
	
	public ArrayList<Notifications> getAllNotification() {
		return NotificationDao.getAllTransaction();
	}
}
