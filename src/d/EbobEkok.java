package d;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("n1 sayısını girin : ");
        int n1=input.nextInt();
        System.out.print("nn sayısını girin : ");
        int n2=input.nextInt();
        int ebob=1;
        
        // while ebob
        int s=1;
        while (s<=n1) {
            s++;
            if (n1 % s == 0 && n2 % s == 0) {
                ebob = s;
            }
        }
        System.out.println(ebob);

        // while ekok
        s=1;
        while (s<=n1*n2) {
            s++;
            if (s%n1==0 && s%n2==0){
                System.out.println(s);
                break;
            }
        }

    }
}
