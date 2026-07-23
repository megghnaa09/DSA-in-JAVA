import java.util.*;
public class addition {
    public static void main(String[] args) {
        int a = 5;
        int b= 6;
        int sum= a+b;
        System.out.println(sum);
        int ans1= sum();
        System.out.println(ans1);
        int ans2= sum(a,b);
        System.out.println(ans2);
        int ans3= sum2(a,b);
        System.out.println(ans3);
        int ans4=sum2();
        System.out.println(ans4);
    }
    static int sum(){
        int a=15;
        int b=80;
        int ab=a+b;
        return ab;
    }
    static int sum(int a, int b){
        return a+b;
    }
    static void sum2(int a, int b){
        int ab= a+b;
    }
    static void sum2(){
        int a=90; int b=100;
        int ans=a+b;
    }
}
