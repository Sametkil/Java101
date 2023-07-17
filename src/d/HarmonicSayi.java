package d;

import java.util.Scanner;

public class HarmonicSayi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a;
        double sum=0;
        System.out.print("Sayi girin : ");
        a=scanner.nextInt();
        for (double i=1;i<=a;i++){
            sum+=(1/i);
        }
        System.out.println(sum);
        
    }
}
