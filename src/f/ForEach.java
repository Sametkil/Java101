package f;

public class ForEach {
    public static void main(String[] args) {
        /*
        int [] list={1,2,3,4};
        for (int i=0;i< list.length;i++){
            System.out.println(list[i]);
        }

        int sum=0;
        for (int i:list){
            System.out.println(i);
            sum+=i;
        }
        System.out.println(sum);
        */

        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        for (int i=0;i< matris.length;i++){
            for (int j=0;j<matris[i].length;j++){
                System.out.print(matris[i][j]+" ");
            }
            System.out.println();
        }

        for (int[] row : matris) {
            for (int col : row) {
                System.out.print(col+" ");
            }
            System.out.println();
        }


    }
}
