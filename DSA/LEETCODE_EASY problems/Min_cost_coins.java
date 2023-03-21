public class Min_cost_coins {
    public static void main(String[] args) {
        int position[] = {2,2,2,3,3};
        int even  = 0; int odd  = 0;
        for(int i:position){
            if(i%2==0)
            even++;
            else
            odd++;

        }
        if(even==position.length || odd == position.length)
        System.out.println(0);

        System.out.println(Math.min(even,odd));

    }
}
