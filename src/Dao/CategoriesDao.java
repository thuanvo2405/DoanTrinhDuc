package Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.Categories;
import Utils.Utils;

public class CategoriesDao {
	public ArrayList<Categories> getAllCategories() {
		ArrayList<Categories> categories = new ArrayList<>();
		
        String query = "SELECT * FROM categories";

        try (Connection conn =  DriverManager.getConnection(Utils.DB_URL, Utils.USER, Utils.PASS);
             PreparedStatement pstmt = conn.prepareStatement(query);
             ResultSet rs =  pstmt.executeQuery()) {
            
            while (rs.next()) {
                
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
		
		return categories;
	}
}
