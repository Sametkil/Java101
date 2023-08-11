package e;

import java.util.Scanner;

public class AsalBul {

    static int asal(int a,int b){
        if (b<a){
            if (a%b!=0){
                return (asal(a,++b));
            }else {
                return 0;
            }
        }
        return 1;
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sayi;
        System.out.print("Bir sayı giriniz : ");
        sayi= scanner.nextInt();

        if (asal(sayi,2)==1){
            System.out.print(sayi+" sayısı asaldır");
        }else {
            System.out.print(sayi+" sayısı asal değildir");
        }
    }
}
