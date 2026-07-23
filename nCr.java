import java.util.*;
public class nCr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int r=sc.nextInt();
        int rem=n-r;
        int soln= function(n)/((function(r)*function(rem)));
        System.out.println(soln);
        sc.close();
    }
    
    static int function(int n){
        if(n==0) return 1;
        if(n==1) return 1;
       int fact = 1;
        for(int i =1; i<=n; i++){
            fact*=i;
            
        }
        return fact;
        

    }
}
