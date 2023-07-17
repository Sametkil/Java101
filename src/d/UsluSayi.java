package d;

import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b,toplam=1;
        System.out.print("Sayı giriniz : ");
        a=input.nextInt();
        System.out.print("Kuvveti giriniz : ");
        b=input.nextInt();

        for (int i=1;i<=b;i++){
            toplam*=a;
        }
        System.out.println("Sonuç : "+toplam);
    }
}
