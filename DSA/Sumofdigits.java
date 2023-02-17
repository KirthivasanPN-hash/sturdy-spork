import java.util.*;

public class Sumofdigits{
    
    public static int sumofdigits_calc(int num){
        int i = num, sum = 0;
        while(i>0){
            int lastdigit = i%10;
            sum+=lastdigit;
            i = i/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("the sum of digit is: "+sumofdigits_calc(num));
    }
}