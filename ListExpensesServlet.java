package servlet;

import dao.ExpenseDAO;
import model.Expense;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class ListExpensesServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ExpenseDAO dao = new ExpenseDAO();
        int userId = 1; // Temporary
        List<Expense> list = dao.listExpenses(userId);

        request.setAttribute("expenses", list);
        RequestDispatcher rd = request.getRequestDispatcher("listExpenses.jsp");
        rd.forward(request, response);
    }
}
