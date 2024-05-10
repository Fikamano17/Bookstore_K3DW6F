package bookstore;
import bookstore.ProductType;
import bookstore.NegativePriceException;

public class Product{
    private int id; //adattagok
    private int price;
    private ProductType type;
    private String name;
    private int popularity;

    // konstruktorok
    public Product(int id, int price, ProductType type, String name){
        this.id = id;
        this.price = price;
        this.type = type;
        this.name = name;

    }

    public Product(int id, ProductType type){
        this.id = id;
        this.type = type;
    }

    public Product(int id, int price, ProductType type, String name, int popularity){
        this.id = id;
        this.price = price;
        this.type = type;
        this.name = name;
        this.popularity =  popularity;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        try{
        if(price<0){
            throw new NegativePriceException();
        }
        this.price = price;
        }
        catch(NegativePriceException e){
            System.out.println(e.getMessage());
        }

    }

    public ProductType getType() {
        return this.type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopularity(){
        return this.popularity;
    }

    public void setPopularity(int popularity){
        this.popularity = popularity;
    }


    @Override //metódus felüldefiniálás
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", price='" + getPrice() + "'" +
            ", type='" + getType() + "'" +
            ", name='" + getName() + "'" +
            ", popularity='" + getPopularity() + "'" +
            "}";
    }
    

}
