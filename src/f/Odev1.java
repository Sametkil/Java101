package f;

import java.util.Arrays;
import java.util.Scanner;

public class Odev1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Dizinin boyutu n:");
        int arrayLength=input.nextInt();
        int[] list=new int[arrayLength];
        System.out.println("Dizinin elemanlarını giriniz:");
        for (int i=0;i<arrayLength;i++){
            System.out.print((i+1)+". Elemanı: ");
            list[i]=input.nextInt();
        }
        System.out.println("Dizi: "+ Arrays.toString(list));
        Arrays.sort(list);
        System.out.println("Sıralı Dizi: "+Arrays.toString(list));
    }
}
