package Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.Notifications;
import Utils.Utils;

public class NotificationsDao {
	public ArrayList<Notifications> getAllTransaction() {
		ArrayList<Notifications> notifications = new ArrayList<>();
		
        String query = "SELECT * FROM notifications";

        try (Connection conn =  DriverManager.getConnection(Utils.DB_URL, Utils.USER, Utils.PASS);
             PreparedStatement pstmt = conn.prepareStatement(query);
             ResultSet rs =  pstmt.executeQuery()) {
            
            while (rs.next()) {
                int user_id = rs.getInt("user_id");
                String username = rs.getString("username");
                String email = rs.getString("email");
                String password_hash = rs.getString("password_hash");
                Date created_at = rs.getDate("created_at");
                Date last_login = rs.getDate("last_login");
                
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
		
		return notifications;
	}
}
