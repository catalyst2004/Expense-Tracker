<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Expense</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-dark text-light">
<div class="container mt-5">
    <h2 class="mb-4 text-info">➕ Add New Expense</h2>

    <form action="addExpense" method="post" class="card p-4 bg-secondary bg-opacity-10 border-info rounded">
        <div class="row mb-3">
            <div class="col-md-6">
                <label for="type" class="form-label">Type</label>
                <select name="type" id="type" class="form-select">
                    <option value="expense">Expense</option>
                    <option value="income">Income</option>
                </select>
            </div>
            <div class="col-md-6">
                <label for="category" class="form-label">Category</label>
                <select name="category" id="category" class="form-select">
                    <option>Food</option>
                    <option>Transport</option>
                    <option>Rent</option>
                    <option>Utilities</option>
                    <option>Entertainment</option>
                    <option>Salary</option>
                    <option>Other</option>
                </select>
            </div>
        </div>

        <div class="row mb-3">
            <div class="col-md-6">
                <label for="amount" class="form-label">Amount</label>
                <input type="number" name="amount" id="amount" class="form-control" step="0.01" required>
            </div>
            <div class="col-md-6">
                <label for="date" class="form-label">Date</label>
                <input type="date" name="date" id="date" class="form-control" required>
            </div>
        </div>

        <div class="mb-3">
            <label for="description" class="form-label">Description</label>
            <textarea name="description" id="description" class="form-control" rows="3" placeholder="Optional details..."></textarea>
        </div>

        <div class="d-flex justify-content-between">
            <button type="submit" class="btn btn-success px-4">Save</button>
            <a href="listExpenses" class="btn btn-outline-info">Back to List</a>
        </div>
    </form>
</div>
</body>
</html>
