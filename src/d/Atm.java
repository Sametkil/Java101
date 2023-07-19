package d;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
            String username,password;
            int rigth=3,select,balance=5000,price;
            Scanner input = new Scanner(System.in);

            System.out.println("Hoşgeldiniz!");


            while (rigth > 0) {
                System.out.print("Kullanıcı Adınız: ");
                username = input.nextLine();
                System.out.print("Şifreniz: ");
                password = input.nextLine();
                if (username.equals("user") && password.equals("123")) {
                    System.out.println("Sisteme başarılı bir şekilde giriş yaptınız.");


                    System.out.println("""
                            1 - Bakiye Sorgulama
                            2 - Para Yatırma
                            3 - Para Çekme
                            4 - Çıkış Yap
                            """);
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select = input.nextInt();

                    do {
                        System.out.println("Bakiyeniz: " + balance);
                        System.out.println("1 - Bakiye Sorgulama\n" +
                                "2 - Para Yatırma\n" +
                                "3 - Para Çekme\n" +
                                "4 - Çıkış Yap\n");
                        System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                        select = input.nextInt();

                        switch (select) {
                            case 1:
                                System.out.print("Para miktarı : ");
                                price = input.nextInt();
                                balance += price;
                            case 2:
                                System.out.print("Para miktarı : ");
                                price = input.nextInt();
                                if (price > balance) {
                                    System.out.println("Bakiye yetersiz.");
                                } else {
                                    balance -= price;
                                }
                            case 3:
                                System.out.println("Bakiyeniz : " + balance);
                            case 4:
                                break;

                            default:
                                System.out.println("1 - Bakiye Sorgulama\n" +
                                        "2 - Para Yatırma\n" +
                                        "3 - Para Çekme\n" +
                                        "4 - Çıkış Yap\n");
                                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                        }
                    } while (select != 4);
                    System.out.print("İyi günler dileriz.");
                    break;

                } else {
                    System.out.println("Hatalı kullanıcı adı veya şifre girişi. Kalan hakkınız: " + --rigth);
                    if (rigth == 0) {
                        System.out.println("Hesabınız bloke edilmiştir.");
                    }
                }
            }
        }
    }