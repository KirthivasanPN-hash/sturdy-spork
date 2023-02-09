https://github.com/kunal-kushwaha/DSA-Bootcamp-Java


## Check sol from Javapoint and GFG

## Create flowchart and pseudocode for the following:

1. Input a year and find whether it is a leap year or not. -done

    # Approach 1

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

    # Approach 1
    
        * create class, methods accrodingly and call method

3. Take a number as input and print the multiplication table for it. -done
    # Approach 1

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
    # Approach 1

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

    # Approach 1

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


09/02/23

# 02 Java programs

1. Write a program to print whether a number is even or odd, also take input from the user. -done

2. Take name as input and print a greeting message for that particular name. -done

3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest. -done

4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

    # Approach 1 imporve this
    

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

5. Take 2 numbers as input and print the largest number. -done

6. Input currency in rupees and output in USD. -done

7. To calculate Fibonacci Series up to n numbers. -done 

    # Approach 1 improve this
    
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

    # Approach 1

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

    # Approach 1

    
import java.io.*;
import java.math.*;

class GFG {
	
	// Prints Armstrong Numbers in given range
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