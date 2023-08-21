package f;

import java.util.Scanner;

public class Array6Harmonik {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç elemanlı olsun :");
        int length = input.nextInt();

        int[] list = new int[length];

        int s=0;
        double hSeri=0;

        while (s<length) {
            System.out.print("Bir eleman ekleyin :");
            for (int i = 0; i < length; i++) {
                list[i]= input.nextInt();
                for (int j=1;j<length;j++){
                    hSeri+=1/list[i];
                }
                s++;
            }
        }
        double hOrt=length/hSeri;

        System.out.println(hOrt);
    }
}