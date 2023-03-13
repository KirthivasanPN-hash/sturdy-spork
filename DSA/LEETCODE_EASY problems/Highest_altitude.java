import java.util.*;
public class Highest_altitude{
public static int largestAltitude(int[] gain) {
    int sum = 0,max=0;
    for(int i=0;i<gain.length;i++){
        sum = sum+gain[i];
        if(max<sum){
            max=sum;
        }   
    }
    if(max<0){
        return 0;
    }
    else{
        return max;
    }
}
public static void main(String[] args) {
    int[] gain = {-5,1,5,0,-7};
    System.out.println(largestAltitude(gain));
}
}