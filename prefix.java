import java.util.*;
public class prefix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int prefix[]=new int[n];
        prefix[0]=arr[0];
        for(int i=0;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int x: prefix){
            System.out.println(x+" ");
        }
    }
}
