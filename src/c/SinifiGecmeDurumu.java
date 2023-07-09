package c;

import java.util.Scanner;

public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        float matematik,fizik,turkce,kimya,muzik;

        System.out.println("Matematik Notunuz : ");
        matematik=inp.nextInt();
        if (matematik<0||matematik>100){
            System.out.println("Geçersiz not girdiniz.");
            matematik=0;
        }
        System.out.println("Fizik Notunuz : ");
        fizik=inp.nextInt();
        if (fizik<0||fizik>100){
            System.out.println("Geçersiz not girdiniz.");
            fizik=0;
        }
        System.out.println("Türkçe Notunuz : ");
        turkce=inp.nextInt();
        if (turkce<0||turkce>100){
            System.out.println("Geçersiz not girdiniz.");
            turkce=0;
        }
        System.out.println("Kimya Notunuz : ");
        kimya=inp.nextInt();
        if (kimya<0||kimya>100){
            System.out.println("Geçersiz not girdiniz.");
            kimya=0;
        }
        System.out.println("Müzik Notunuz : ");
        muzik=inp.nextInt();
        if (muzik<0||muzik>100){
            System.out.println("Geçersiz not girdiniz.");
            muzik=0;
        }

        float average = ((matematik + fizik + turkce + kimya + muzik) / 5);

        if (average<=55){
            System.out.println("Kaldınız...");
        }else {
            System.out.println("Geçtiniz...");
        }
        System.out.println("Ortalamanız : "+average);
    }

}
