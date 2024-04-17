package bookstore;
import bookstore.Product;
import bookstore.Store;
import java.util.*;


public class Bookstore extends Store{
    private String name;
	private String city;
	private String street;
	private String street_number;
	private String zip_code;
    private Product[] products;

    public Bookstore(Product[] products, String name, String street, String city, String zip_code, String street_number){
        this.products = products;
        this.name = name;
        this.street_number = street_number;
        this.street = street;
        this.city= city;
        this.zip_code = zip_code;
    }

    public Bookstore(String name, String street, String city, String zip_code, String street_number){
        this.name = name;
        this.street_number = street_number;
        this.street = street;
        this.city= city;
        this.zip_code = zip_code;
    }

    public String[] advertisements(){
        List<Product> top3 =  new ArrayList<Product>();
        for (Product product : top3) {
            
        }

        }
    

    public void listProducts(){
        System.out.println("mukodj");

    }

   // ----------------------------------------------------------

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet_number() {
        return this.street_number;
    }

    public void setStreet_number(String street_number) {
        this.street_number = street_number;
    }

    public String getZip_code() {
        return this.zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    public Product[] getProducts() {
        return this.products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
    


    
    


}
