package e;

import java.util.Scanner;

public class HesapMakinesi {

    static int sum(int a,int b){
        int result=a+b;
        System.out.println("Toplam : "+result);
        return result;
    }
    static int diff(int a,int b){
        int result=a-b;
        System.out.println("Fark : "+result);
        return result;
    }
    static int multip(int a,int b){
        int result=a*b;
        System.out.println("Çarpım : "+result);
        return result;
    }
    static int divi(int a,int b){
        if (b==0){
            System.out.println("İkinci sayı 0 olamaz");
            return 0;
        }
        int result = a / b;
        System.out.println("Bölüm : "+result);
        return result;
    }
    static int power(int a,int b){
        int result=1;
        for (int i=1;i<=b;i++){
            result*=a;
        }
        return result;
    }
    static int mod(int a,int b){
        return a%b;
    }
    static void calc(int a ,int b){
        System.out.println("Çevresi : "+(2*(a+b)));
        System.out.println("Alanı : "+(a*b));
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Mod Alma\n"
                + "7- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        while (true){
            System.out.println(menu);
            System.out.print("Bir işlem seçiniz :");
            select=scanner.nextInt();

            if (select==0){
                break;
            }

            System.out.print("İlk sayı : ");
            int a=scanner.nextInt();
            System.out.print("İkinci sayı : ");
            int b=scanner.nextInt();

            switch (select){
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    diff(a,b);
                    break;
                case 3:
                    multip(a,b);
                    break;
                case 4:
                    divi(a,b);
                    break;
                case 5:
                    System.out.println("Üs hesabı : " +power(a,b));
                    break;
                case 6:
                    System.out.println("Mod işlemi : "+mod(a,b));
                    break;
                case 7:
                    calc(a,b);
                    break;
                default:
                    System.out.println("Geçersiz bir işlem girdiniz.");
            }
        }
        System.out.println("İşlem bitmiştir...");
    }
}
