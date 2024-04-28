import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import bookstore.*;

public class App {
    public static void main(String[] args){
        String filePath="products.txt";
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

        
    
    }
}
