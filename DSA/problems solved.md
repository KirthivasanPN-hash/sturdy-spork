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


5. Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

    # Approach 1

    summ = 0
    count = 1
    while raw_input("Enter q to quit or any other key to continue") != 'q':
    summ = summ+input()
    count=count+1
    print summ/(count*1.0)
    
