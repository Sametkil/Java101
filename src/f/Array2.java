package f;

public class Array2 {
    public static void main(String[] args) {
        double[] list=new double[5];
        double list2[]=new double[10];

        String[] days={"Pazartesi","Salı","Çarşamba","Perşembe","Cuma"};
        String[] weekend=new String[]{"Cumartesi","Pazar"};
        weekend[0]="pazar";
        System.out.println(weekend[0]);

        System.out.println(days.length);


        for (int i=0;i< days.length;i++){
            System.out.println(days[i]);
        }
    }
}
