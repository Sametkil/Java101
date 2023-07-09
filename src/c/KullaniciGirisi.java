package c;

import java.util.Objects;
import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        String userName,password,newPassword;
        int a;

        System.out.println("Kullanıcı adı giriniz : ");
        userName = inp.nextLine();
        System.out.println("Şifre giriniz : ");
        password = inp.nextLine();

        if (userName.equals("Java") && password.equals("1234")){
            System.out.println("Giriş Başarılı...");
        } else if (!password.equals(1234)) {
            System.out.println("Şifreniz yanlış");
            System.out.println("Sıfırlamak için 1 e basın.");
            a = inp.nextInt();
            switch (a){
                case 1:
                    System.out.println("Yeni şifrenizi girin : ");
                    newPassword= inp.nextLine();
                    if (newPassword.equals(password)){
                        System.out.println("Yeni şifre ile eskisi aynı olamaz.");
                    }else {
                        newPassword.equals(password);
                    }
                            break;
                default:
                    System.out.println("Şifre sıfırlama iptal edildi");
            }
        }
    }
}
