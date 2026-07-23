import java.util.*;
public class distributeInClass{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k = sc.nextInt();
        int ans=(k+m-1)%n;
        if(ans==0) ans=n;
        System.out.println(ans);
        sc.close();
    }

}