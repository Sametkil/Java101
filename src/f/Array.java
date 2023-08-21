package f;

public class Array {
/*
    static void printArray(int[] arr){
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    static void printArray(double[] arr){
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
*/
    static int [] reverse(int[] list){
        int[] reverse=new int[list.length];
        for (int i=0,j= list.length-1;i< list.length;i++,j--){
            reverse[i]=list[j];
        }
        return reverse;
    }
    static void printArray(int[] list){
        for (int i=0;i< list.length;i++){
            System.out.println(list[i]);
        }
    }

    public static void main(String[] args) {
        /*
        int [] list=new int[10];
        list[0]=10;
        list[1]=20;
        list[2]=30;
        */
        /*
        System.out.println(list.length);
        System.out.println(list[1]);

        System.out.println("---");

         for (int i=0;i<list.length;i++){
            list[i]=(i*10)+10;
            System.out.println(list[i]);
        }

        System.out.println("---");

        int[] list2={1,2,3,4,5};
        System.out.println(list2[3]);

        System.out.println("---");
        */

        /*
        int[] list3={5,10,15,20,25,30};
        for (int i=0;i<list3.length;i++){
            System.out.println(list3[i]);
        }
        */

/*
        int[] list4={2,4,6,8,10,12,14,16,18,20};
        double [] list5={1.1,2.2,3.3};
        printArray(list4);
        System.out.println("----");
        printArray(list5);
*/

        int[] list={10,20,30,40,50,60,70,80,90,100};
        int[] newListe=reverse(list);
        printArray(newListe);
    }
}
