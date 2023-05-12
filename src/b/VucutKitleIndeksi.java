package b;

import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        double boy,kilo,vki;
        System.out.println("Boyunuzu giriniz : ");
        boy=inp.nextDouble();
        System.out.println("Kilonuzu giriniz : ");
        kilo=inp.nextDouble();

        vki=kilo/(boy*boy);

        System.out.println("Vücut Kitle İndeksiniz : " + vki);
    }
}
