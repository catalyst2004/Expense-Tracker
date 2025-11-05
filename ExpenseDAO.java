package dao;

import java.sql.*;
import java.util.*;
import model.Expense;

public class ExpenseDAO {

    public void addExpense(Expense expense) {
        String sql = "INSERT INTO expenses (user_id, type, category, amount, description, date) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, expense.getUserId());
            ps.setString(2, expense.getType());
            ps.setString(3, expense.getCategory());
            ps.setDouble(4, expense.getAmount());
            ps.setString(5, expense.getDescription());
            ps.setString(6, expense.getDate());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Expense> listExpenses(int userId) {
        List<Expense> list = new ArrayList<>();
        String sql = "SELECT * FROM expenses WHERE user_id = ? ORDER BY date DESC";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, userId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Expense e = new Expense(
                        rs.getInt("id"),
                        rs.getInt("user_id"),
                        rs.getString("type"),
                        rs.getString("category"),
                        rs.getDouble("amount"),
                        rs.getString("description"),
                        rs.getString("date")
                );
                list.add(e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void deleteExpense(int id) {
        String sql = "DELETE FROM expenses WHERE id=?";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
