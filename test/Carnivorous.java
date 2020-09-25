package test;

public class Carnivorous extends Animal {
    final int a;

    public Carnivorous() {
        this.a = 10;
    }

    void eat() {
        System.out.println("Eats non-veg");
    }
}
