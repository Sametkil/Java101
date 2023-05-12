package b;

import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int r;
        double pi=3.14,alan,cevre;

        System.out.println("Yaricap giriniz : ");
        r=inp.nextInt();

        alan=pi*r*r;
        cevre=2*pi*r;

        System.out.println("Dairenin alanı : " + alan);
        System.out.println("Dairenin cevresi : " + cevre);




        double aci,alan2;

        System.out.println("Merkez açı girin : ");
        aci=inp.nextDouble();

        alan2=(pi*(r*r)*aci)/360;

        System.out.println("Alan2 : " + alan2);


    }
}
