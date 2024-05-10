package bookstore;

public class NegativePriceException extends Exception { //öröklődés
    public NegativePriceException(){
        super("The price cannot be negative.");
    }

}
