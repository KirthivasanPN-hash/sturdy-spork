https://github.com/kunal-kushwaha/DSA-Bootcamp-Java

## Create flowchart and pseudocode for the following:

1. Input a year and find whether it is a leap year or not. -done

    ## Approach:

            import java.util.*;
            class Test
            {
                static boolean checkYear(int year)
                {
                    if (year % 400 == 0)
                        return true;

                    if (year % 100 == 0)
                        return false;
                
                    if (year % 4 == 0)
                        return true;
                    return false;
                }
                    
                public static void main(String[] args)
                {
                    System.out.println("Enter a year");
                    Scanner sc = new Scanner(System.in);
                    int year = sc.nextInt();
                    System.out.println( checkYear(year)? "Leap Year" :
                                    "Not a Leap Year" );
                }
            }

2. Take two numbers and print the sum of both. -done

    ## Approach:
    
    * create class, methods accrodingly and call method

3. Take a number as input and print the multiplication table for it. -done
     
     ## Approach:

    import java.util.*;

    public class basic_problems{
        static void multi(int n){
            for(int i=0;i<100;i++){
                System.out.println(n*i);
            }
        }

        public static void main(String[] args) {
            multi(9);
        }
    }

    ## Note u can't call non static method in main function or u should create an object

4. Take 2 numbers as inputs and find their HCF and LCM.

    ## Approach:

    * HCF

    import java.util.Scanner;

    public class prac
    {
    public static void main(String[] args)
    {
        int hcf, a, b;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the Two Numbers: ");
        a = s.nextInt();
        b = s.nextInt();
        
        for(hcf=(a<b)?a:b; true; hcf--)
        {
            if((a%hcf==0) && (b%hcf==0))
                break;
        }
        
        System.out.println("\nHCF(" +a+ ", " +b+ ") = " +hcf);
    }
    }

    * LCM 

    import java.util.Scanner;

    public class prac
    {
    public static void main(String[] args)
    {
        int a, b, lcm;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the Two Numbers: ");
        a = s.nextInt();
        b = s.nextInt();
        
        if(a>b)
            lcm = a;
        else
            lcm = b;
        
        while(true)
        {
            if((lcm%a==0) && (lcm%b==0))
                break;
            else
                lcm++;
        }
        
        System.out.println("\nLCM(" +a+ ", " +b+ ") = " +lcm);
    }
    }


5. Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all. -done

    ## Approach:

        import java.util.*;
        class prac{
            static void sum(){
                int sum=0, product=1;

                Scanner sc  = new Scanner(System.in);
                
                String option = "";

                    while(!option.equals("x")){
                        System.out.println("Enter a num or x to quit");
                        option = sc.next();

                        if(!option.equals("x")){
                            int num = Integer.parseInt(option);
                            sum+=num;
                            product*=num;
                        
                        }
                    }
                System.out.println("Sum is: "+sum+"\nProduct is: "+product);
            }
            public static void main(String[] args) {
                sum();
            }
        }


# II Java programs

4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

    ## Approach:
    

    import java.util.*;

    class prac{
        static void sum(){
            int sum=0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a value:");
            
            int a = sc.nextInt();
            
            System.out.println("Enter another value:");
            int b  = sc.nextInt();
            
            System.out.println("enter option");
            String op =  sc.next();
            
            //while(!op.equals()) 
            if(op.equals("+")){
                sum=a+b;

            }
            System.out.println("Sum is: "+sum);
        }
        public static void main(String[] args) {
            sum();
        }
    }

7. To calculate Fibonacci Series up to n numbers. -done 

    ## Approach:
    
    import java.util.*;
    class prac{
    static void prob(){
    
    int n1=0, n2=1, n3;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of terms:");    
    int n = sc.nextInt();
    n3 = n1+n2;
    System.out.print("Fibonacci series: "+n1+" "+n2);
    for(int i=0;i<n;i++){
        System.out.print(" "+n3);
        n1=n2;
        n2=n3;
        n3=n1+n2;
    }
    }
    public static void main(String[] args) {
        prob();
    }
}


8. To find out whether the given String is Palindrome or not.

    ## Approach:

    import java.util.*;

    class prac {
        static void palindrome() {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string:");
            String a = sc.next();

            int j = a.length() - 1;
            int i = 0;
            boolean flag = true;
            while (i < j) {
                if (a.charAt(i) != a.charAt(j)) {
                    System.out.println("Not palindrome");
                    flag = false;
                
                }
                i++;
                j--;
                
                break;
            }
            if(flag==true){
            System.out.println("Palindrome");
            }
        }

    public static void main(String[] args) {
        palindrome();
        }
    }
    
9. To find Armstrong Number between two given number.

    ## Approach:

    import java.io.*;
    import java.math.*;
    class Armstrong {
         static void findArmstrong(int low, int high)
        {
            for (int i = low + 1; i < high; ++i) {
        
                // number of digits calculation
                int x = i;
                int n = 0;
                while (x != 0) {
                    x /= 10;
                    ++n;
                }
                
                // compute sum of nth power of
                // its digits
                int pow_sum = 0;
                x = i;
                while (x != 0) {
                    int digit = x % 10;
                    pow_sum += Math.pow(digit, n);
                    x /= 10;
                }
        
                // checks if number i is equal
                // to the sum of nth power of
                // its digits
                if (pow_sum == i)
                    System.out.print(i + " ");	
            }
        }
        
        public static void main(String args[])
        {
            int num1 = 100;
            int num2 = 400;
            findArmstrong(num1, num2);
            System.out.println();
        }
    }

## Time Complexity: O(n*logn), n is the range 


# III. Write Java programs for the following:

## Basic problems are straight forward and just requires little thinking

## Intermediate Java Programs

1. Factorial Program In Java - done 

    ## Approach:

    Using recursion

        
    import java.io.*;
    import java.math.*;
    import java.util.Scanner;

    class Factorial{
        static int fact(int n){
            if(n==0){
                return 1;
            }
            else{
                return (n*fact(n-1));
            }
        }
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            int n = sc.nextInt();
            int f  = fact(n);
            System.out.println("factorial: " +f);
        }
    }


2. Calculate Electricity Bill

    ## Approach:

    import java.util.*;  
       
    // create class ElectricityBill to calculate electricity bill using Inheritance  
    class ElectricityBillExample4 extends CalculateBill  
    {   
        // main() method start  
        public static void main(String args[])   
        {     
            // declare variable units  
            int units;  
      
            // create Scanner class object to take input from user  
            Scanner sc = new Scanner(System.in);  
      
            System.out.println("Enter number of units for calculating electricity bill.");  
            units = sc.nextInt();  
      
            System.out.println("The electricity bill for "+units+" is:" + getBill(units));   
        }   
    }  
    class CalculateBill  
    {     
        // variable to calculate electricity bill to pay  
        static double billToPay;  
        static double getBill(long units)  
        {  
            // check whether units are less than 100  
            if(units < 100)  
            {  
                billToPay = units*1.20;  
            }  
            // check whether the units are less than 300  
            else if(units < 300){  
                billToPay = 100*1.20+(units - 100)*2;  
            }  
            // check whether the units are greater than 300  
            else if(units > 300)  
            {  
                billToPay = 100*1.20+200*2+(units - 300)*3;  
            }  
            return billToPay;  
        }      
    }  

5. Calculate Distance Between Two Points

     ## Approach:

    public double calculateDistanceBetweenPointsWithHypot(
        double x1, 
        double y1, 
        double x2, 
        double y2) {
            
        double ac = Math.abs(y2 - y1);
        double cb = Math.abs(x2 - x1);
            
        return Math.hypot(ac, cb);
    }
  
7. Power In Java -done

   ## int i=(int)Math.pow(5,2); //Type Cast to integer   

8. Calculate Depreciation of Value 

    ## Approach:

     V - initial rate, r - rate of depreciation and T - time

    import java.io.*;
    class Depreciation
    {
         static float D_rate(float v, float r, float t)
        {
        float D = (float)(v * Math.pow((1 - r / 100), t));
        return D;
        }
        public static void main(String[] args)
        {
            float V1 = 200, R = 10, T = 2;
            
            System.out.print(Depreciation(V1, R, T));
        }
    }

9. Calculate Batting Average -done

    ## Batting Average

    1. batting avg = (runs scored)/(Number of times out)

    2. Out = Number of innings - not out


    import java.util.*;
    class Batting_avg {
        static int avg_rate(int runs, int matches, int not_out) {

            int out = matches - not_out;

            if (out == 0) {
                return -1;
            }

            int avg = (runs) / out;

            return avg;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of matches played: ");
            int matches = sc.nextInt();
            System.out.println("No of runs scored: ");
            int runs = sc.nextInt();
            System.err.println("Enter not out matches: ");
            int not_out = sc.nextInt();

            int avg = avg_rate(runs, matches, not_out);

            if (avg == -1) {
                System.out.println("NA");
            } 
            else {

                System.out.println("The batting average is: " +avg);

            }

        }
    }

15. Find Ncr & Npr -done

    ## Approach:
    
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

16. Reverse A String In Java -done (refer drive)
    
    ## Approach:

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

17. Future Investment Value
    ## Approach:

    formula for future investment
    double f=p*Math.pow((1+r/100),y);
    
21. Perfect Number In Java
 
    ## Approach:

    public class perfectnum_prob {
    public static void main(String args[]) {
        long n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = sc.nextLong();
        int i = 1;
        // executes until the condition becomes false
        while (i <= n / 2) {
            if (n % i == 0) {
                // calculates the sum of factors
                sum = sum + i;
            } // end of if
              // after each iteration, increments the value of variable i by 1
            i++;
        } // end of while
          // compares sum with the number
        if (sum == n) {
            // prints if sum and n are equal
            System.out.println(n + " is a perfect number.");
        } // end of if
        else
            // prints if sum and n are not equal
            System.out.println(n + " is not a perfect number.");
        }
    }
    
23. Sum Of A Digits Of Number
     
    ## Approach:

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


24. Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of   days he can go out in the month of August.

## Approach:

    1. for loop itrations till the end of month
    2. count the number of even days with the help of counter variable
    3. return the value
    
25. Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

## Approach: 

import java.util.Scanner;
public class Number_sum 
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        int nSum = 0, eSum = 0, oSum = 0;
        System.out.println("Enter Numbers:");
            while (true) {
                int n = in.nextInt();
                
                if (n == 0) {
                    break;
                }
                
                if (n < 0) {
                    nSum += n; 
                }
                else if (n % 2 == 0) {
                    eSum += n;
                }
                else {
                    oSum += n;
                }
            }
            
        System.out.println("Negative No. Sum = " + nSum);
        System.out.println("Positive Even No. Sum = " + eSum);
        System.out.println("Positive Odd No. Sum = " + oSum);
    }
}




