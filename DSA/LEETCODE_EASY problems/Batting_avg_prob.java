// Algorithm
// Step 1: first we calucalate the number of times the batsman is out
// Step 2: to calculate step 1: out = matches - not_out matches
// Step 3: calculate the batting avg based on step 1

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
