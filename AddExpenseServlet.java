package servlet;

import dao.ExpenseDAO;
import model.Expense;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class AddExpenseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int userId = 1; // Later get from session after login
        String type = request.getParameter("type");
        String category = request.getParameter("category");
        double amount = Double.parseDouble(request.getParameter("amount"));
        String description = request.getParameter("description");
        String date = request.getParameter("date");

        Expense expense = new Expense(0, userId, type, category, amount, description, date);
        ExpenseDAO dao = new ExpenseDAO();
        dao.addExpense(expense);

        response.sendRedirect("listExpenses");
    }
}
