package d;

import java.util.Scanner;

public class DonguEx1 {
    public static void main(String[] args) {
        // 0dan girilen sayiya kadar olan sayilardan
        // 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
        Scanner input=new Scanner(System.in);
        int a,counter=0,sum=0;
        System.out.println("Bir sayı giriniz : ");
        a = input.nextInt();

        for (int i=0;i<=a;i++){
            if((i%3==0)&&(i%4==0)) {
                sum+=i;
                counter++;
                System.out.println(i);
            }
        }
        System.out.println("Sayiların ortalaması :"+sum/counter);
    }
}
