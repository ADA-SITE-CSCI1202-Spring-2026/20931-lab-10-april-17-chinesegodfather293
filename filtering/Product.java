package filtering;
// package 20931-lab-10-april-17-chinesegodfather293.filtering;

public class Product {
    String name;
    double price;
    boolean inStock;
    public Product(String name, double price, boolean inStock) {
        this.name = name;
        this.price = price;
        this.inStock = inStock;
    }   
    
    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", inStock=" + inStock + "]";
    }

    
}
