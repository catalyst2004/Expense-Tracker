package servlet;

import dao.ExpenseDAO;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class DeleteExpenseServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        ExpenseDAO dao = new ExpenseDAO();
        dao.deleteExpense(id);
        response.sendRedirect("listExpenses");
    }
}
