public class Unique_integers{
public static int[] sumZero(int n) {
    int ans[] = new int[n];
    int start = 0;
    int end = ans.length-1;
    while(start<end){
        ans[start] = start+1;
        ans[end] = ans[start]*(-1);
        start++;
        end--;
    }
    return ans;
}
    public static void main(String[] args) {
        int n =5;
        System.out.println(n);
    }
}