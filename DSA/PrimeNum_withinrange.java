import java.util.*;

public class PrimeNum_withinrange {
    static void PrimeNum_value(){
        boolean flag = true;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter start range: ");
        int start = sc.nextInt();
        System.out.println("Enter start range: ");
        int end = sc.nextInt();
        
        for(int i=start;i<=end;i++){
            
            if(i==0 || i==1)
            continue;
            
            flag = true;
            

            for(int j=2;j<=i/2;j++){
                if(i%j ==0){
                    flag =  false;
                    break;
                }
            }
            
            if(flag == true){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
     
 
        PrimeNum_value();
           
    }

}
