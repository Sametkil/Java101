package b;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        double fiyat=10,mesafe,kmTutar=2.20;

        System.out.println("Gidilicek mesafeyi girin : ");
        mesafe= input.nextDouble();

        fiyat+=mesafe*kmTutar;

        fiyat=(fiyat<20) ? 20:fiyat;

        System.out.println("Fiyat : "+ fiyat);

    }
}
