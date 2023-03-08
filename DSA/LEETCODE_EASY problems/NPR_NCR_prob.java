import java.util.*;
public class NPR_NCR_prob {
    public static int fact(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact = fact*i;

        }
        return fact;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of objects: ");
        int num = sc.nextInt();
        System.out.println("enter the selected objects:  ");
        int r = sc.nextInt();
        System.out.println("Combination value: "+(fact(num)/(fact(num-r)*fact(r))));
        System.out.println("Permutation value: "+(fact(num)/(fact(num-r))));
    }
}