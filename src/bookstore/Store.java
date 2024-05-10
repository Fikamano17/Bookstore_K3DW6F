package bookstore;
import java.util.*;

public abstract class Store { //absztrakt osztály
    
    public abstract void advertisements(); //törzs nélküli függvények 

    public abstract void listProducts();

    public abstract double calculateProfit();

    public abstract boolean isThere(String name);

    public abstract List<Product> priceRange(int min, int max);
    
}
