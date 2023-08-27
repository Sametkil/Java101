package f;

import java.util.Arrays;

public class Odev2 {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        Arrays.sort(list);
        for (int i : list) {
            int counter = 0;
            for (int j : list) {
                if (i == j) {
                    counter++;
                }
            }
            System.out.println(i+" sayısı dizide " +counter+ " kadar tekrar ediyor");
        }
    }
}