
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.Math.max;

//Arraylist intialization
// Adding and Max value
// List<Boolean>
//For each
public class grt_candies {
    public static void main(String[] args) {
        int []items = {2,3,5,1,3};
        int extra  = 3;
        int maxi=0;
        ArrayList<Boolean> candies  = new ArrayList<>();
       // Boolean flag  = true;
        for(int m:items){
            maxi = max(m,maxi);
        }
        for(int c:items){
            candies.add(c+extra>=maxi);


        }
        System.out.println(candies);

    }
}