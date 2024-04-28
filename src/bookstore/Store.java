package bookstore;
import java.util.*;

public abstract class Store {
    
    public abstract void advertisements();

    public abstract void listProducts();

    public abstract double calculateProfit();

    public abstract boolean isThere(String name);

    public abstract List<Product> priceRange(int min, int max);
    
}
