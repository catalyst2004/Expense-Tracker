<%@ page import="java.util.*, model.Expense" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>My Expenses</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-dark text-light">
<div class="container mt-5">
    <h2 class="text-info mb-4">📊 My Expense Records</h2>

    <div class="mb-3">
        <a href="addExpense.jsp" class="btn btn-success">➕ Add Expense</a>
        <a href="index.jsp" class="btn btn-outline-light ms-2">🏠 Home</a>
    </div>

    <table class="table table-dark table-hover table-bordered align-middle text-center">
        <thead class="table-info text-dark">
        <tr>
            <th>ID</th>
            <th>Type</th>
            <th>Category</th>
            <th>Amount</th>
            <th>Description</th>
            <th>Date</th>
            <th>Actions</th>
        </tr>
        </thead>
        <tbody>
        <%
            List<Expense> list = (List<Expense>) request.getAttribute("expenses");
            if (list != null && !list.isEmpty()) {
                for (Expense e : list) {
        %>
        <tr>
            <td><%= e.getId() %></td>
            <td><%= e.getType() %></td>
            <td><%= e.getCategory() %></td>
            <td>₹<%= String.format(\"%.2f\", e.getAmount()) %></td>
            <td><%= e.getDescription() == null ? \"-\" : e.getDescription() %></td>
            <td><%= e.getDate() %></td>
            <td>
                <a href=\"deleteExpense?id=<%= e.getId() %>\" class=\"btn btn-danger btn-sm\">Delete</a>
            </td>
        </tr>
        <%
                }
            } else {
        %>
        <tr><td colspan=\"7\" class=\"text-muted\">No records found.</td></tr>
        <% } %>
        </tbody>
    </table>
</div>
</body>
</html>
