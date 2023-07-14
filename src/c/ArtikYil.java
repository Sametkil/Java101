package c;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int yil;
        System.out.print("Yıl giriniz : ");
        yil= input.nextInt();

        if (yil%4==0){
            if (yil%100==0 && yil%400==0){
                System.out.println(yil +" Artık Yıldır");
            }else {
                System.out.println(yil +" Artık Yıl Değildir" );
            }
        }else {
            System.out.println(yil +" Artık Yıl Değildir" );
        }
    }
}
