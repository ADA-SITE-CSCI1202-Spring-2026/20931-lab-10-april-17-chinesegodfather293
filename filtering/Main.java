package filtering;
// package 20931-lab-10-april-17-chinesegodfather293.filtering;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Product> isAffordable = product -> product.price < 50 && product.inStock;
        
        List<Product> products = new ArrayList<>();
        
        products.add(new Product("Laptop", 999.99, true));
        products.add(new Product("Mouse", 29.99, true));
        products.add(new Product("Keyboard", 79.99, false));
        products.add(new Product("Monitor", 299.99, true));
        products.add(new Product("USB Cable", 9.99, true));
        products.add(new Product("Headphones", 149.99, false));
        products.add(new Product("Webcam", 89.99, true));
        
        System.out.println("Before filtering:");
        for (Product product : products) {
            System.out.println(product);
        }
        
        products.removeIf(isAffordable.negate());
        
        System.out.println("\nAfter removing expensive or unavailable items:");
        for (Product product : products) {
            System.out.println(product);
        }
        
    }
}
