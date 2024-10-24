//https://leetcode.com/problems/richest-customer-wealth/
//first add all column and then compare with max
import java.util.*;
public class Richest_Customer_Wealth {
    public static void main(String[] args) {
    int [][]accounts = {{1,2,3},{3,2,1}};
    int max = 0,sum;

    for(int i=0;i<accounts.length;i++){
        sum=0;
        for (int j = 0;j<accounts[0].length;j++){
            sum+=accounts[i][j];
        }
        if(sum>max)
            max = sum;
    }
        System.out.println(max);
    }
}