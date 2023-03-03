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


III. Write Java programs for the following:

Intermediate Java Programs

1. Factorial Program In Java - done 

    # Approach 1

    using for loop

    # Approach 2

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

## 10/02/23
2. Calculate Electricity Bill

    # Approach 1

     // import required classes and package if any  
    import java.util.*;  
       
    // create class ElectricityBillExample4 to calculate electricity bill using Inheritance  
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
           
    // create simple class CalculateBill  
    class CalculateBill  
    {     
        // variable to calculate electricity bill to pay  
        static double billToPay;  
        ***************why should we intialize here******
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


3. Calculate Average Of N Numbers -done

4. Calculate Discount Of Product -done
    
5. Calculate Distance Between Two Points

    # approach 1


public void givenTwoPoints_whenCalculateDistanceByFormula_thenCorrect() {
    double x1 = 3;
    double y1 = 4;
    double x2 = 7;
    double y2 = 1;

    double distance = service.calculateDistanceBetweenPoints(x1, y1, x2, y2);

    assertEquals(distance, 5, 0.001);
}

# Approach 2

public double calculateDistanceBetweenPointsWithHypot(
    double x1, 
    double y1, 
    double x2, 
    double y2) {
        
    double ac = Math.abs(y2 - y1);
    double cb = Math.abs(x2 - x1);
        
    return Math.hypot(ac, cb);
}

6. Calculate Commission Percentage - done (same like discount)
    
7. Power In Java -done

   # int i=(int)Math.pow(5,2); //Type Cast to integer   

8. Calculate Depreciation of Value 

    # Approach 1

V - initial rate, r - rate of depreciation and T - time

import java.io.*;
 
class Depreciation
{
 
// Function to return the depreciation of value
static float D_rate(float v,
                          float r, float t)
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

    # Batting Average
    batting avg = (runs scored)/(Number of times out)

    Out = Number of innings - not out

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

10. Calculate CGPA Java Program (anna university)


    # Approach 1
    

11. Compound Interest Java Program - (same as batting prob)

12. Calculate Average Marks -done

13. Sum Of N Numbers -done
    
14. Armstrong Number In Java doubt

15. Find Ncr & Npr -done

    # Approach 
    
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
    
    Find if a number is palindrome or not
    * palindrome of a number -done

17. Future Investment Value

    # Approach 1

    formula for future investment
    double f=p*Math.pow((1+r/100),y);

18. HCF Of Two Numbers Program -done 
    
19. LCM Of Two Numbers -done
    
20. Java Program Vowel Or Consonant -done (check simple method)
    
21. Perfect Number In Java

    # Approach:

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
    
22. Check Leap Year Or Not -done

23. Sum Of A Digits Of Number


    
24. Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of   days he can go out in the month of August.
    
25. Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.



## Functions problems

1. Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user. -done

2. Define a program to find out whether a given number is even or odd. -done 


3. A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible  to vote. -done

4. Write a program to print the sum of two numbers entered by user by defining your own method. -done

5. Define a method that returns the product of two numbers entered by user. -done

6. Write a program to print the circumference and area of a circle of radius entered by user by defining your own method. -done

7. Define a method to find out if a number is prime or not. -done

8. Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:

 
Marks        Grade 
91-100         AA 
81-90          AB 
71-80          BB 
61-70          BC 
51-60          CD 
41-50          DD 
<=40          Fail


package com.tcc.java.programs;
 
import java.util.Scanner;
 
public class StudentGrade {
    public static void main(String[] args) {
        int count, i;
        float totalMarks = 0, percentage, average;
        Scanner scanner;
        scanner = new Scanner(System.in);
 
        System.out.println("Enter Number of Subject");
        count = scanner.nextInt();
 
        System.out.println("Enter Marks of " + count + " Subject");
        for (i = 0; i < count; i++) {
            totalMarks += scanner.nextInt();
        }
         
        System.out.println("Total MArks : " + totalMarks);
        // Each subject is of 100 Marks
        percentage = (totalMarks / (count * 100)) * 100;
 
        switch ((int) percentage / 10) {
        case 9:
            System.out.println("Grade : A+");
            break;
        case 8:
        case 7:
            System.out.println("Grade : A");
            break;
        case 6:
            System.out.println("Grade : B");
            break;
        case 5:
            System.out.println("Grade : C");
            break;
        default:
            System.out.println("Grade : D");
            break;
        }
    }
}


9. Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.- 

4! = 1 * 2 * 3 * 4 = 24 
3! = 3 * 2 * 1 = 6 
2! = 2 * 1 = 2 
Also, 
1! = 1 
0! = 1

10. Write a function to find if a number is a palindrome or not. Take number as parameter. -done.

11. Convert the programs in flow of program, first java, conditionals & loops assignments into functions. -done

12. Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number). 


13. Write a function that returns all prime numbers between two given numbers.

14. Write a function that returns the sum of first n natural numbers. -done

22/02

https://github.com/kunal-kushwaha/DSA-Bootcamp-Java

3,7
Arrays easy LEETCODE

1. 

2. Concatenation of Array

code:

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int ans[] = new int[2*n];
        for(int i=0;i<nums.length;i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}




3. Running Sum of 1d Array

Code: 

class Solution {

    public int[] runningSum(int[] nums) {

        for(int i=1;i<nums.length;i++){

            nums[i]+=nums[i-1];

        }        

        return nums;

    }

}


4. Richest Customer Wealth

Code:

class Solution {
    public int maximumWealth(int[][] accounts) {
       // int row_wealth  = accounts.length;
       // int col_wealth = accounts[0].length;
        int max=0,sum;
        for(int i=0;i<accounts.length;i++){
            sum=0;
            for(int j=0;j<accounts[0].length;j++){
                sum+=accounts[i][j];
            }
                if(sum>max)
                max = sum;
            }
        
        return max;
    }
}

5. Shuffle the array

code:

}class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[] = new int[2*n];
        int count = 0;
        for(int i=0;i<n;i++){
            ans[count] = nums[i];
            ans[count+1] = nums[n+i];
            count+=2;
        }
        return ans;
    }
}

6. Kids With the Greatest Number of Candies

code:

 class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(int c : candies) max = Math.max(c, max);
        List<Boolean> output = new ArrayList(candies.length);
        for(int c : candies) output.add(c + extraCandies >= max);
        return output;
    }
}

7. Number of good pairs

code:

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j])
                {
                    count++;
                }
            }
        }
        return count;
    }
}

8. How many numbers are small than the current number

code:

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int ans[] = new int[nums.length];
        int i,j;
        int count = 0;
        for(i=0;i<nums.length;i++){
            
            for(j=0;j<nums.length;j++){
                
            if(nums[i]>nums[j]){
                count++;
            }
                
            
        }
        ans[i] = count;
        count=0;
    }
    return ans;
}
}


9. Create a target array 

code:

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        
        for(int i = 0; i < index.length; i++){
            int ind = index[i];
            
            if(ind < i){
                int j = i;
                while(j > ind){
                    target[j] = target[j - 1]; 
                    target[j - 1] = nums[i];
                    j--;
                }
            }
            else{
                 target[i] = nums[ind];
            }
            
        }
        return target;
    }
}


10. Check if a sentence is pangram

code:

class Solution {
    public boolean checkIfPangram(String sentence) {
        
        for (int i = 0; i < 26; ++i) {
            char currChar = (char)('a' + i);
            if (sentence.indexOf(currChar) == -1)
                return false;
        }
        return true;
    }
}

11. Count Item Matching a Rule

code:

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int res = 0;
        
        for(int i = 0 ;i<items.size();i++){
            if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)) res++;
            if(ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)) res++;
            if(ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)) res++;
        }
        
        return res;
        
    }
}

12. didnt understand


13. Flipping an Image

code:

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        for(int i=0;i<image.length;i++){
           reverse(image[i]);
           invert(image[i]);
        }
        // Either can use the for loop to invert the array individually or can use in single for loop
        // for(int i=0;i<image.length;i++){
        //    invert(image[i]);
        // }
        return image;
        
    }
    
    static void reverse(int []image){
        int s=0;
        int e=image.length-1;
        
        while(s<e){
            int temp=image[s];
            image[s] = image[e];
            image[e] = temp;
            s++;
            e--;
        }
    }
    
    static void invert(int []arr){
           for(int i=0;i<arr.length;i++){
               if(arr[i]==0){
                   arr[i]=1;
               }
               else{
                   arr[i]=0;
               }
           }
    }
}

14. should check 

15. Matrix Diagonal Sum

code:

class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
		int n=mat.length;
        for(int i=0;i<n;i++){
            sum+=mat[i][i]+mat[i][n-i-1];
        }
        if(mat.length%2 != 0){
            sum-=mat[n/2][n/2];// if matrix is odd the middle number added two times,so we deduct the middle number
        }
        return sum;
    }
}
