package d;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Kaç satır olsun: ");
        int satir= input.nextInt();

        for (int i=satir;i>=1;i--){
            for (int j=1;j<=(satir-i);j++){
                System.out.print(" ");
            }
            for (int k=1;k<=(2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
