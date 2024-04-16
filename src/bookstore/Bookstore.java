package bookstore;

public class Bookstore extends Store{
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
        
    }

    public void listProducts();



    
    


}
