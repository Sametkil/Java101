package e;

public class Overloading {
    static void print(){
        System.out.println("Parametresiz");
    }
    static void print(int a){
        System.out.println("Parametre :"+a);
    }
    static int print(int a,int b){
        return a+b;
    }
    static int print(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        print();
        print(12);
        System.out.println(print(2,3));
        System.out.println(print(2,3,4));
    }
}
