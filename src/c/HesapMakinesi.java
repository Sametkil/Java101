package c;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b,islem;

        System.out.print("1.Sayiyi giriniz : ");
        a= input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz : ");
        islem=input.nextInt();

        System.out.print("2.Sayiyi giriniz : ");
        b=input.nextInt();


        switch (islem) {
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                if (b==0){
                    System.out.println("Sayı 0'a bölünemez");
                }else {
                    System.out.println(a/b);
                }
                break;
            default:
                System.out.println("Yanlış seçim yaptınız !");
        }
    }
}
