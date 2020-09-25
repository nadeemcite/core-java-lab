package oops;

public class Aeroplane implements CanFly {

    public final int X = 100;

    // // Default Contructor
    public Aeroplane() {
        System.out.println("Aeroplane created");

    }

    // Parameterized Constructor
    public Aeroplane(int size) {
        System.out.println("Aeroplane created by parameter");
    }

    @Override
    public void fly() {
        System.out.println("Aeroplane can fly very fast");
    }

    int area(int a) {
        return a * a;
    }

    float area(float a) {
        return a * a;
    }

    int area(int a, int b) {
        return a * b;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}