import java.util.*;
import bookstore.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Product asd= new Product(0, null);
        System.out.println(asd.getId());
        Bookstore fgh=new Bookstore("bokok", "1","some","0123", "258");
        System.out.println(fgh.getName());

        List<Product> top3 = new ArrayList<Product>();
        top3.add(new Product(0, 1500, ProductType.BOOK, "ize", 600));
        top3.add(new Product(1, 20, ProductType.BOOK, "Java Programming", 500));
        top3.add(new Product(2, 15, ProductType.NOTEBOOK, "Spiral Notebook", 300));
        top3.add(new Product(3, 5, ProductType.PEN, "Ballpoint Pen", 700));
        top3.add(new Product(4, 3, ProductType.BOOKMARK, "Bookmark Set", 200));
        top3.add(new Product(5, 30, ProductType.AUDIOBOOK, "The Great Gatsby Audiobook", 800));
        top3.add(new Product(6, 8, ProductType.KEYCHAIN, "Keychain with LED Light", 400));
        top3.add(new Product(7, 10, ProductType.BOOK, "Harry Potter and the Philosopher's Stone", 900));
        top3.add(new Product(8, 25, ProductType.NOTEBOOK, "Leather Journal", 600));
        top3.add(new Product(9, 2, ProductType.PEN, "Gel Pen Set", 1000));
        top3.add(new Product(10, 6, ProductType.BOOKMARK, "Metal Bookmark", 250));
        top3.add(new Product(11, 18, ProductType.AUDIOBOOK, "The Hitchhiker's Guide to the Galaxy", 720));

        Collections.sort(top3, new PopularityComparator());

        for(Product product: top3){
            
            System.out.println(product.toString());
        }



    }
}
