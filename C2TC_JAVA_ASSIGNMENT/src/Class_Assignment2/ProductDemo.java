package Class_Assignment2;

public class ProductDemo {
	public static void main(String[] args) {
       
		Product  p1 = new Product(101, "Laptop", 750.00);
        Product p2 = new Product(102, "Smartphone", 499.99);
        Product p3 = new Product(103, "Tablet", 299.00);
        Product p4 = new Product(104, "Smartwatch", 199.99);

        
        System.out.println("Product Details:");
        p1.display();
        p2.display();
        p3.display();
        p4.display();
    }
}

