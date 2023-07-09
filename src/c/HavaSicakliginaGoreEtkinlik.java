package c;

import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlik {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        float heat;

        System.out.print("Sıcaklığı Giriniz : ");
        heat=inp.nextFloat();

        if (heat>=25){
            System.out.println("Yüzmeye Gidebilirsiniz.");
        }else if (heat>5) {
            if (heat>15){
                System.out.println("Pikniğe Gidebilirsiniz.");
            }
            if (heat<15){
                System.out.println("Sinamaya Gidebilirsiniz.");
            }
        }else {
            System.out.println("Kayağa gidebilirsiniz");
        }

    }
}
