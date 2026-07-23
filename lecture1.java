import java.util.*;
class lecture1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
    int n= sc.nextInt();
    
    
    for(int i=0; i<=n; i++){
        int prod = i*x;
        
        System.out.println(x+" * "+ i +" = "+prod);
    }
    sc.close();
    }
}
