package d;

import java.util.Scanner;

public class WhileEx {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int password;
        boolean isPasswordSuccess=true;

        while (isPasswordSuccess){
            System.out.println("Şifre Giriniz : ");
            password=input.nextInt();
            if (password==123){
                System.out.println("Doğru");
                isPasswordSuccess=false;
            }else {
                System.out.println("Yanlış");
            }
        }
    }
}
