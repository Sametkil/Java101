package d;

import java.util.Scanner;

public class FaktoriyelKombinasyon {
    public static void main(String[] args) {
        // n! / (r! * (n-r)!)

        Scanner input=new Scanner(System.in);
        int n,r,nTotal=1,rTotal=1,nrTotal=1;
        System.out.print("Bir sayı giriniz : ");
        n=input.nextInt();
        System.out.print("Kaçlı kombinasyonu olsun : ");
        r=input.nextInt();

        for (int i=1;i<=n;i++){
            nTotal*=i;
        }
        for (int i=1;i<=r;i++){
            rTotal*=i;
        }
        for (int i=1;i<=(n-r);i++){
            nrTotal*=i;
        }

        System.out.println(n+" Faktoriyel : "+nTotal);
        System.out.println(n+"'nin "+r+"'lü Kombinasyonu : "+(nTotal/(rTotal*nrTotal)));
    }
}
