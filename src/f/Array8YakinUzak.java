package f;

import java.util.Arrays;
import java.util.Scanner;

public class Array8YakinUzak {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] list = {15,12,788,1,-1,-778,2,0};
        Arrays.sort(list);
        System.out.print("Bir sayı giriniz : ");
        int a = input.nextInt();
        int yakinSayi = 0;
        int uzakSayi = 0;

        for (int i:list) {
            if ((i<a) && (i>yakinSayi)){
                yakinSayi=i;
            }
        }
        for (int i:list) {
            if (i>a){
                uzakSayi=i;
                break;
            }
        }
        System.out.println("Girilen sayıya en yakın sayı : "+yakinSayi);
        System.out.println("Girilen sayıya en uzak sayı : "+uzakSayi);
    }
}
