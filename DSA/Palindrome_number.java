import java.util.*;

public class Palindrome_number {
    static int palindrome_check(int num){
        int revNum = 0;
        int temp = num;
        while(temp>0){
            int lastdigit = temp%10;
            revNum = revNum*10+lastdigit;
            temp = temp/10;
        }
        if(num==revNum){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        {
            Scanner sc  = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num = sc.nextInt();

            palindrome_check(num);
            System.out.println(palindrome_check(num));
        }
    }
}
