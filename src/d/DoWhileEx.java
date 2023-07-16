package d;

import java.util.Scanner;

public class DoWhileEx {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int password;
        boolean askPassword=true;

        do {
            System.out.println("Şifre Giriniz : ");
            password=input.nextInt();
            if (password==123){
                System.out.println("Doğru");
                askPassword=false;
            }else {
                System.out.println("Yanlış");
            }
        } while (askPassword);
    }
}
