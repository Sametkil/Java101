package d;

import java.util.Scanner;

public class DonguEx2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,sum=0;
        do {
            System.out.print("Bir sayı giriniz :");
            a = input.nextInt();
            if ((a%4==0)){
                sum+=a;
            }
        } while (a%2==0);

        System.out.println("Sayıların toplamı :"+sum);
    }
}
