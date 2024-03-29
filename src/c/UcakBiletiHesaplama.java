package c;

import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double km, costPerKm = 0.1 , total;
        byte type;
        int age;
        boolean isError = false;

        System.out.print("Mesafeyi giriniz : ");
        km = inp.nextDouble();

        System.out.print("Yaşınızı giriniz : ");
        age = inp.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        type = inp.nextByte();
        total = km * costPerKm;

        if (age<12){
            total *= 0.5;
        }
        else if (age<=24) {
            total *= 0.9;
        }
        else if (age>65) {
            total *= 0.7;
        }

        switch (type){
            case 2:
                total *= 0.8;
                total *= 2;
                break;
            case 1:
                break;
            default:
                isError = true;
        }

        if (!(km>=0)){
            isError = true;
        }

        if (isError){
            System.out.println("Hatalı Veri Girdiniz !");
        }
        else{
            System.out.println("Toplam Tutar: " + total + " TL");
        }
    }
}