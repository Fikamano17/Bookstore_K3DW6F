package bookstore;
import bookstore.Product;
import bookstore.Store;
import java.util.*;


public class Bookstore extends Store{ //öröklődés
    private String name; // adattagok
	private String city;
	private String street;
	private String street_number;
	private String zip_code;
    private Product[] products; //tömb
    public static double tax=0.27; //osztályszintű adattag
    private final String country; // konstans 

    public Bookstore(Product[] products, String name, String street, String city, String zip_code, String street_number,String country){
        this.products = products;
        this.name = name;
        this.street_number = street_number;
        this.street = street;
        this.city= city;
        this.zip_code = zip_code;
        this.country = country;
    }

    public Bookstore(String name, String street, String city, String zip_code, String street_number,String country){
        this.name = name;
        this.street_number = street_number;
        this.street = street;
        this.city= city;
        this.zip_code = zip_code;
        this.country = country;
    }

    @SuppressWarnings("unchecked")
    public void advertisements(){
        List<Product> rankedList =  Arrays.asList(this.products);
        Collections.sort(rankedList, new PopularityComparator());
        System.out.println("A "+ this.name+ " legnépszerűbb termékei: ");
        
        for(int i=0; i<3; i++){
            Product product=rankedList.get(i);
            System.out.println(product.getName()+" "+product.getPrice()+" pénz");
        }
        }

        
    

    public void listProducts(){
        System.out.println("Termékek a " + this.name + "üzletben:\n");
        for (Product product : products) {
            System.out.println(product);
            
        }

    }

    public double calculateProfit(){
        double sum=0;
        for(Product i :this.products){
            sum+=i.getPrice()*i.getPopularity()*(1-tax);
        }
        return sum;
    }

    public boolean isThere(String name){
        for(Product i : this.products){
            if(i.getName()==name){
                return true;
            }
        }
        return false;

    }

    public List<Product> priceRange(int min, int max){
        List<Product> items=new ArrayList<Product>();
        for(Product i: this.products){
            if(i.getPrice()>=min&&i.getPrice()<=max){
                items.add(i);
            }
        }
        return items;
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
    
    public String getCountry(){
        return this.country;
    }

    
    


}
