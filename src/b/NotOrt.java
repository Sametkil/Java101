package b;

import java.util.Scanner;

public class NotOrt {
    public static void main(String[] args) {


        //Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik
        Scanner inp = new Scanner(System.in);

        int mat,fiz,kim,tr,tar,muz,toplam;
        double ort;
        String durum;

        System.out.println("Matematik Notunuzu Girin : ");
        mat=inp.nextInt();
        System.out.println("Fizik Notunuzu Girin : ");
        fiz=inp.nextInt();
        System.out.println("Kimya Notunuzu Girin : ");
        kim=inp.nextInt();
        System.out.println("Türkçe Notunuzu Girin : ");
        tr=inp.nextInt();
        System.out.println("Tarih Notunuzu Girin : ");
        tar=inp.nextInt();
        System.out.println("Müzik Notunuzu Girin : ");
        muz=inp.nextInt();

        toplam =(mat+fiz+kim+tr+tar+muz);
        ort = toplam/6.0;

        if (ort>=60){
            durum="Basarili";
        }else {
            durum="Basarisiz";
        }


        System.out.println("Ortalaması : " + ort);
        System.out.println("Durumunuz : " + durum);


    }
}
