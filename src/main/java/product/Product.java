package product;

import java.util.Comparator;

public abstract class Product {
    public static int PRINT_COUNT = 0;

    protected String name;
    protected int quantity;
    protected double price;

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public static void print(String name, int quantity, double price) {
        System.out.println(new Product(name, quantity, price) {
        });
        PRINT_COUNT++;
    }

    public static void printCount() {
        System.out.println("product.Product print count: " + PRINT_COUNT);
    }

    public void setQuantity(int quantity) { this.quantity = quantity; }

    public void setPrice(double price) { this.price = price; }

    public void setName(String name) { this.name = name; }

    public String getName() { return name; }

    public double getQuantity() { return quantity; }

    public double getPrice() { return price * quantity; }

    @Override
    public String toString() {
        return "product.Product: name=" + name + ", quantity=" + (quantity) + ", price=" + (quantity * price);
    }

    public static class ProductComparator implements Comparator<Product> {

        @Override
        public int compare(Product o1, Product o2) {
            return o1.name.compareTo(o2.name);
        }
    }
}
