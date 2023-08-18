package e;

public class BoksMain {
    public static void main(String[] args) {

        BoksFighter f1 = new BoksFighter("A", 10, 120, 100,40,30);
        BoksFighter f2 = new BoksFighter("B", 20, 85, 85,30,20);

        BoksMatch boksMatch = new BoksMatch(f1, f2, 85, 100);
        boksMatch.run();
    }
}
