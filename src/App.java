import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import bookstore.*;

public class App {
    public static void main(String[] args){
        String filePath="products.txt";
        Product[] products= readProducts(filePath);
        Bookstore[] stores=new Bookstore[5];

        stores[0]=new Bookstore(getRandomProducts(10, products),"Tulip Bookstore", "Red Tulip","London","3713","21", "UK");
        stores[1] = new Bookstore(getRandomProducts(20, products), "Book Haven", "Main St", "New York", "10001", "123", "USA");
        stores[2] = new Bookstore(getRandomProducts(30, products), "Books R Us", "Elm St", "Los Angeles", "90001", "456", "USA");
        stores[3] = new Bookstore(getRandomProducts(40, products), "Book Nook", "Oak St", "Chicago", "60601", "789", "USA");
        stores[4]= new Bookstore(getRandomProducts(50, products), "Bookworm", "Petőfi St", "Miskolc", "3530", "61", "Hungary");
        Bookstore.tax=0;
        System.out.println("Bevétel adók nélkül:");
        for (Bookstore bookstore : stores) {
            System.out.println(bookstore.getName()+" bevétele: " + Math.round(bookstore.calculateProfit())+" pénz");
            
        }

        Bookstore.tax=0.27;
        System.out.println("Bevétel 27% adóval:");
        for (Bookstore bookstore : stores) {
            System.out.println(bookstore.getName()+" bevétele: "+ Math.round(bookstore.calculateProfit())+" pénz");
        }

        stores[0].advertisements();
        stores[1].listProducts();


        
    
    }

    public static Product[] readProducts(String filePath){

        int count=0;
        Product[] results=new Product[60];

        try{
            FileReader fileReader=new FileReader(filePath);
            BufferedReader bufferedReader= new BufferedReader(fileReader);
            String line;
            while ((line=bufferedReader.readLine())!=null) {

                String[] fields=line.split(",");
                int price=Integer.parseInt(fields[1]);
                if (price<0) {
                    throw new NegativePriceException();
                                
                }

                int id = Integer.parseInt(fields[0]);

                ProductType type = ProductType.valueOf(fields[2]);

                String name = fields[3];

                int popularity = Integer.parseInt(fields[4]);

                Product product=new Product(id, price, type, name, popularity);
                results[count]=product;
                count++;
                
            }
            bufferedReader.close();

        }catch(IOException e){
            e.printStackTrace();
        }catch(NegativePriceException e){
            e.printStackTrace();
        }catch(IllegalArgumentException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }

        return results;
    }

    public static Product[] getRandomProducts(int num, Product[] products){
        Random random=new Random();
        Product[] result=new Product[num];
        List<Integer> rands=new ArrayList<Integer>();



        if(num>60){
            System.out.println("A szám kisebb kell, hogy legyen mint 60.");
            return null;
        }

        for(int i=0; i<num; i++){

            Integer rand = random.nextInt(60);
            while(rands.contains(rand)){
                rand=random.nextInt(60);
            }
            
            result[i]=products[rand];
            rands.add(rand);
        }
        return result;
    }
}
