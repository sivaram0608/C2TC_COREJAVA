package Class_Assignment2;
public class Product {
	private int productId;
	private String productName;
	private double price;


	public Product(int productId, String productName, double price) {
    this.productId = productId;
    this.productName = productName;
    this.price = price;
}

// Method to display product details
public void display() {
    System.out.println("ID: " + productId + ", Name: " + productName + ", Price: $" + price);
}
}


