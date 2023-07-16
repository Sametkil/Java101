package d;

public class BreakContinueEx {
    public static void main(String[] args) {
        for (int i=0;i<=10;i++){
            if (i==5){
                break;
            }
            System.out.println("Break: "+i);
        }
        for (int j=0;j<=15;j+=2){
            if (j%5==0){
                continue;
            }
            System.out.println("Continue: "+j);
        }

    }
}
