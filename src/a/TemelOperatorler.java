package a;

public class TemelOperatorler {
    public static void main(String[] args) {
        // Atama =,+=,-=,*=,/=,%=
        // Aritmetik +,-,*,/,%,++,++
        // Mantiksal &&,||,!a
        // Karşilastirma ==,!=,>,<,>=,<=

        // Kosul
        int a=5,b=6,c=5;
        boolean durum1=a==c;
        boolean durum2=a>=b;
        boolean sonuc= durum1 || durum2;

        String str=sonuc ? "Dogru":"Yanlis";
        int result = sonuc ? 1:0;

        System.out.println(str);

    }
}
