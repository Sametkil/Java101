package c;

import java.util.Scanner;

public class BurcBul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ay, gun;
        String burc = "";

        System.out.print("Doğduğunuz ayı girin :");
        ay = input.nextInt();
        System.out.println("Doğduğunuz günü girin :");
        gun = input.nextInt();

        if (ay == 1) {
            if (gun < 22 && gun > 0) {
                burc = "Oğlak";
            } else if (gun>0 && gun<31){
                burc = "Kova";
            }
        } else if (ay == 2) {
            if (gun < 20 && gun > 0) {
                burc = "Kova";
            } else if (gun>0 && gun<28){
                burc = "Balık";
            }
        } else if (ay == 3) {
            if (gun < 21 && gun > 0) {
                burc = "Balık";
            } else if (gun>0 && gun<31){
                burc = "Koç";
            }
        } else if (ay == 4) {
            if (gun < 21 && gun > 0) {
                burc = "Koç";
            } else if (gun>0 && gun<30){
                burc = "Boğa";
            }
        } else if (ay == 5) {
            if (gun < 22 && gun > 0) {
                burc = "Boğa";
            } else if (gun>0 && gun<31){
                burc = "İkizler";
            }
        } else if (ay == 6) {
            if (gun < 23 && gun > 0) {
                burc = "İkizler";
            } else if (gun>0 && gun<30){
                burc = "Yengeç";
            }
        } else if (ay == 7) {
            if (gun < 23 && gun > 0) {
                burc = "Yengeç";
            } else if (gun>0 && gun<31){
                burc = "Aslan";
            }
        } else if (ay == 8) {
            if (gun < 23 && gun > 0) {
                burc = "Aslan";
            } else if (gun>0 && gun<30){
                burc = "Başak";
            }
        } else if (ay == 9) {
            if (gun < 23 && gun > 0) {
                burc = "Başak";
            } else if (gun>0 && gun<31){
                burc = "Terazi";
            }
        } else if (ay == 10) {
            if (gun < 23 && gun > 0) {
                burc = "Terazi";
            } else if (gun>0 && gun<30){
                burc = "Akrep";
            }
        } else if (ay == 11) {
            if (gun < 22 && gun > 0) {
                burc = "Akrep";
            } else if (gun>0 && gun<31){
                burc = "Yay";
            }
        } else if (ay == 12) {
            if (gun < 22 && gun > 0) {
                burc = "Yay";
            } else if (gun>0 && gun<30){
                burc = "Oğlak";
            }
        } else {
            System.out.println("Hatalı ay girdiniz");
        }
        System.out.print("Burcunuz :" +burc);
    }
}
