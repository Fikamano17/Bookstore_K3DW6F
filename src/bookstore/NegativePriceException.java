package bookstore;

public class NegativePriceException extends Exception {
    public NegativePriceException(){
        super("The price cannot be negative.");
    }

}
