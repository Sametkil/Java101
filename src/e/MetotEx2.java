package e;

public class MetotEx2 {
    static int sum(int a,int b){
        int result=a+b;
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        int result=sum(5,2)+sum(3,1);
        System.out.println(result);
    }
}
