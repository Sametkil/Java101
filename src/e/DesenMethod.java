package e;

import java.util.Scanner;

public class DesenMethod {
    static void cikar(int a,int b){
        if (a>0){
            System.out.print(a+" ");
            a-=5;
            cikar(a,b);
        }else {
            arttir(a,b);
        }
    }
    static void arttir(int a,int b){
        if (a<=b){
            System.out.print(a+" ");
            a+=5;
            arttir(a,b);
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n,m;
        System.out.print("N Sayısı : ");
        n=scanner.nextInt();
        m=n;
        cikar(n,m);

    }
}
