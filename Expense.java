package model;
public class Expense {
    private int id;
    private int userId;
    private String type;
    private String category;
    private double amount;
    private String description;
    private String date;

    public Expense() {}

    public Expense(int id, int userId, String type, String category, double amount, String description, String date) {
        this.id = id;
        this.userId = userId;
        this.type = type;
        this.category = category;
        this.amount = amount;
        this.description = description;
        this.date = date;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }
}
