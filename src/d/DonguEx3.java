package d;

import java.util.Scanner;

public class DonguEx3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi,sayac=0;
        System.out.print("Bir sayi giriniz : ");
        sayi=input.nextInt();
        for (int i=1;i<=sayi;i*=4 ){
            System.out.println("4'ün "+sayac+" katı :" +i);
            sayac++;
        }
        sayac=0;
        for (int j=1;j<=sayi;j*=5){
            System.out.println("5'in "+sayac+" katı :" +j);
            sayac++;
        }

    }
}