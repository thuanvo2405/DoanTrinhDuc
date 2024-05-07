package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.Budgets;
import Utils.Utils;

public class BudgetsDao {
	public ArrayList<Budgets> getAllBudget() {
		ArrayList<Budgets> budgets = new ArrayList<>();
		
        String query = "SELECT * FROM budgets";

        try (Connection conn =  DriverManager.getConnection(Utils.DB_URL, Utils.USER, Utils.PASS);
             PreparedStatement pstmt = conn.prepareStatement(query);
             ResultSet rs =  pstmt.executeQuery()) {
            
            while (rs.next()) {
                
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
		
		return budgets;
	}
}
