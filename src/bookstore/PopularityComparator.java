package bookstore;

import java.util.Comparator;

public class PopularityComparator implements Comparator {

    @Override //metódus felüldefiniálás
    public int compare(Object one, Object two){
        Product p1=(Product)one; 
        Product p2=(Product)two;
        if(p1.getPopularity()==(p2.getPopularity())){
            return 0;
        }
        else if(p1.getPopularity()<p2.getPopularity()){
            return 1;
        }
        else return -1;
    }


}
