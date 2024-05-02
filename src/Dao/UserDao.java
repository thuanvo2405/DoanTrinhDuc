package Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

import Model.User;
import Utils.Utils;

public class UserDao {
	public ArrayList<User> getAllUser() {
		ArrayList<User> users = new ArrayList<>();
		
        String query = "SELECT * FROM users";

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
                User user = new User(user_id,username,email,password_hash,created_at,last_login);
                users.add(user);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
		
		return users;
	}
	
	public int DangNhap (String emailuser,String pass ) {
		// tạo chứa data để duyệt
		Map<String, String> account = new HashMap<String, String>();
		int success = 0;
		
        String query = "SELECT email , password_hash FROM users";

        try (Connection conn =  DriverManager.getConnection(Utils.DB_URL, Utils.USER, Utils.PASS);
             PreparedStatement pstmt = conn.prepareStatement(query);
             ResultSet rs =  pstmt.executeQuery()) {
            
            while (rs.next()) {
                String email = rs.getString("email");
                String password_hash = rs.getString("password_hash");
                
                account.put(email, password_hash);
            }
            
    		for (Map.Entry<String, String> item : account.entrySet()) {
                if(item.getKey().equals(emailuser)) {
                	if(item.getValue().equals(pass)) {
                		success = 1;
                	}
                }
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return success;	
	}
	
	public int DangKy(String name,String emailUser,String pass) {
		int success = 0;
		// Kiem tra mail co ton tai khong
		ArrayList<String> emailList = new ArrayList<String>();
        String query = "SELECT email FROM users";
        try (Connection conn =  DriverManager.getConnection(Utils.DB_URL, Utils.USER, Utils.PASS);
             PreparedStatement pstmt = conn.prepareStatement(query);
             ResultSet rs =  pstmt.executeQuery()) {
            
            while (rs.next()) {
                String email = rs.getString("email");
                emailList.add(email);  
            }
            
            for (String item:emailList) {
            	if(item.equals(emailUser)) {
            		return success;
            	}
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        // Neu mail chua ton tai thi co the dang ky
        String query2 = "INSERT INTO users (username, email, password_hash, created_at, last_login) VALUES ('"
        		+ name + "', '" + emailUser + "', '" + pass + "', '" + java.time.LocalDate.now() + "', '" + java.time.LocalDate.now() + "')";
        try {
        	Connection conn = DriverManager.getConnection(Utils.DB_URL, Utils.USER, Utils.PASS);
        	PreparedStatement pstmt = conn.prepareStatement(query2);
            int rs = pstmt.executeUpdate();
            if(rs > 0) {
            	success = 1;
            }
        }catch(Exception e) {
        	e.printStackTrace();
        }
        return success;	
	}
		
}
