

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n  = input.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        int sum = sumArray(arr,n);
        System.out.print(sum);
    }
    public static int sumArray(int[] arr, int n){
        int s = 0;
        for(int x:arr)
            s+=x;
        return s;
    }
}
