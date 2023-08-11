package e;

import java.util.Scanner;

public class RecursiveUsluSayi {

    static int kuvvet(int a,int b){
        int cevap = 1;
        for (int i=1;i<=b;i++){
            cevap*=a;
        }
        return cevap;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int taban,üst;
        System.out.print("Taban sayıyı giriniz : ");
        taban=scanner.nextInt();
        System.out.print("Kuvveti giriniz : ");
        üst=scanner.nextInt();

        System.out.println(kuvvet(taban,üst));
    }
}
