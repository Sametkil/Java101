package d;

import java.util.Scanner;

public class FindMaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter,num;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        System.out.print("Kaç tane sayı gireceksiniz: ");
        counter=input.nextInt();
        for(int i=1;i<=counter;i++){
            System.out.print(i+". Sayıyı giriniz : ");
            num=input.nextInt();
            if(num>max) max=num;
            else if(num<min) min=num;
        }
        System.out.println("en büyük değer: "+max);
        System.out.println("en küçük değer: "+min);

    }
}
