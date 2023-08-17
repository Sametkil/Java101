package e;

public class CarMain {
    public static void main(String[] args) {
        Car audi=new Car("Audi",10,"blue");
        audi.printInfo();


        audi.increaseSpeed(20);
        audi.decreaseSpeed(10);
        audi.printSpeed();


        Car bmw=new Car();
        bmw.increaseSpeed(20);
        bmw.increaseSpeed(25);
        bmw.increaseSpeed(60);
        bmw.increaseSpeed(100);
        bmw.printSpeed();

        Car mercedes=new Car();
        mercedes.printSpeed();

    }
}
