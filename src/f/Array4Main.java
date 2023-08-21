package f;

import java.util.Arrays;

public class Array4Main {
    public static void main(String[] args) {
        int [] list={1,2,3,4,5,6,7};
        double [] list2={50,20,40,10,30};
        int [] list3={5,9,1,0,6,21,987,1421,456,-78,2};

        System.out.println(Arrays.toString(list));
        Arrays.fill(list,10);
        System.out.println(Arrays.toString(list));
        Arrays.fill(list,2,7,10);
        System.out.println(Arrays.toString(list));

        Arrays.sort(list2);
        System.out.println(Arrays.toString(list2));

    //    System.out.println(Array4a.search(list3,21));

        Arrays.sort(list3);
        System.out.println(Arrays.toString(list3));
        System.out.println(Arrays.binarySearch(list3,9));


    }
}
