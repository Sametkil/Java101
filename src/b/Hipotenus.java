package b;

import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double a,b,c,cevre,alan,u;
        System.out.println("1. Kenar uzunluğu giriniz : ");
        a=input.nextDouble();

        System.out.println("2. Kenar uzunluğu giriniz : ");
        b=input.nextDouble();

        c=Math.sqrt((a*a)+(b*b));
        u=(a+b+c)/2;
        cevre=u*2;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Hipotenüsün uzunluğu : "+c);
        System.out.println("Cevre : " + cevre);
        System.out.println("Alan : " + alan);


    }
}
