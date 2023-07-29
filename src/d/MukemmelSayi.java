package d;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int toplam=0,sayi;
        System.out.print("Bir sayı giriniz : ");
        sayi = input.nextInt();

        if (sayi<=1) {
            System.out.println(input +" Mükemmel sayı değildir");
        }else {
            for(int i = 1;i<sayi;i++) {
                if(sayi % i == 0) {
                    toplam +=i;
                }
            }

            if(sayi - toplam == 0) {
                System.out.println(input + " Mükemmel sayıdır");
            }else {
                System.out.println(input+ " Mükemmel sayı değildir");
            }


        }
    }
}
