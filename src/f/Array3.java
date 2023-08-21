package f;

public class Array3 {
    public static void main(String[] args) {

        int[][] matris = new int[3][4];
  //      System.out.println(matris.length);
  //      System.out.println(matris[0].length);

        int number=1;

        for (int i = 0; i < matris.length; i++) {
            for (int j=0;j<matris[i].length;j++){
                matris[i][j]=number++;
            }
        }
  //      System.out.println(matris[2][3]);

        for (int i=0;i< matris.length;i++){
            for (int j=0;j<matris[i].length;j++){
                System.out.print(matris[i][j]+" ");
            }
            System.out.println();
        }
    }
}
