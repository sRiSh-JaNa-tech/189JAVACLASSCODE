import java.util.*;
abstract class Product{
    protected String productId;
    protected String name;
    protected double price;
    protected int quantity;

    Product(String productId, String name, double price, int quatity){
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quatity;
    }

    public String getProductId(){return productId;}
    public String getName(){return name;}
    public double getPrice(){return price;}
    public int getQuantity(){return quantity;}
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public double calculateValue(){
        return price * quantity;
    }
    public abstract void display();
}

class Electronics extends Product{
    private int warrantyInMonths;
    Electronics(String productId, String name, double price, int quantity, int warrantyInMonths){
        super(productId, name, price, quantity);
        this.warrantyInMonths = warrantyInMonths;
    }
    @Override 
    public void display(){
        System.out.println("Electronics Product");
        System.out.println("ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Warranty (months): " + warrantyInMonths);
    }
}

class Grocery extends Product{
    private String expirationDate;
    Grocery(String productId, String name, double price, int quantity, String expirationDate){
        super(productId, name, price, quantity);
        this.expirationDate = expirationDate;
    }
    @Override 
    public void display(){
        System.out.println("Grocery Product");
        System.out.println("ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Expiration Date: " + expirationDate);
    }
}

class Store{
    private Map<String, Product> inventory = new HashMap<>();
    public void addProduct(Product p) {
        if (inventory.containsKey(p.getProductId())) {
            System.out.println("Product ID already exists!");
        } else {
            inventory.put(p.getProductId(), p);
            System.out.println("Product added successfully.");
        }
    }
    public void displayAllProducts() {
        if (inventory.isEmpty()) {
            System.out.println("No products in inventory.");
            return;
        }
        for (Product p : inventory.values()) {
            p.display();
            System.out.println("-----------------------------");
        }
    }
    public Product findProductById(String productId) {
        return inventory.get(productId);
    }
    public void updateQuantity(String productId, int newQuantity) {
        Product p = inventory.get(productId);
        if (p != null) {
            p.setQuantity(newQuantity);
            System.out.println("Quantity updated for " + p.getName());
        } else {
            System.out.println("Product not found.");
        }
    }
    public double calculateTotalInventoryValue() {
        double total = 0;
        for (Product p : inventory.values()) {
            total += p.calculateValue();
        }
        return total;
    }
}
public class ShoppingCenter {
    public static void main(String[] args) {
        Store store = new Store();

        // Adding some products
        Product laptop = new Electronics("E001", "Laptop", 60000.0, 10, 24);
        Product phone = new Electronics("E002", "Smartphone", 30000.0, 15, 12);
        Product rice = new Grocery("G001", "Basmati Rice", 80.0, 50, "2025-12-31");

        store.addProduct(laptop);
        store.addProduct(phone);
        store.addProduct(rice);

        System.out.println("\n--- All Products ---");
        store.displayAllProducts();

        System.out.println("\n--- Find Product ---");
        Product found = store.findProductById("E002");
        if (found != null) found.display();

        System.out.println("\n--- Update Quantity ---");
        store.updateQuantity("G001", 100);
        store.findProductById("G001").display();

        System.out.println("\n--- Total Inventory Value ---");
        System.out.println("Total value = ₹" + store.calculateTotalInventoryValue());
    }
}
