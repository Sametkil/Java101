package b;

import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {

        double para,kdvOran=0.18 ,kdv,kdvsiz;

        Scanner input=new Scanner(System.in);

        System.out.println("Miktar girin : ");
        para = input.nextDouble();

        kdv= para * kdvOran ;
        kdvsiz= (para-kdv);

        System.out.println("KDV : " + kdv);
        System.out.println("KDV'siz fiyat : " + kdvsiz);
        System.out.println("KDV'li fiyat : " + para);
    }
}
