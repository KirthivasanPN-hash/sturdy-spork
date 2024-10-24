//https://www.youtube.com/watch?v=MYC7t8GSg0A&ab_channel=ProgrammersZone
//https://leetcode.com/problems/maximum-population-year/description/
// optimize the approach pending
import java.util.*;
public class Max_pop_yr {
    public static void main(String[] args) {
        int[][] logs = {{1993, 1999}, {2000, 2010}};
        int[] arr = new int[101];
        for (int i = 0; i < logs.length; i++) {
            for (int j = logs[i][0]; j < logs[i][1]; j++) {
                arr[j - 1950]++; //good approach for incrementing the value for each year
            }
        }
        int maxyr = 0;
        int maxval = 0;
        for (int i = 0; i < 101; i++) {
            if (maxval < arr[i]) {
                maxval = arr[i];
                maxyr = i + 1950;
            }
        }
        System.out.println(maxyr);
    }
}