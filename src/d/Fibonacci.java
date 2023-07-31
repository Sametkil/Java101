package d;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, a=0, b=1,total=a+b;
        System.out.print("Sayı giriniz: ");
        n = input.nextInt();
        System.out.print(n + " Elemanlı Fibonacci Serisi : ");
        for (int i=1; i<=n; i++){
            System.out.print(a + " ");
            a=b;
            b=total;
        }
    }
}