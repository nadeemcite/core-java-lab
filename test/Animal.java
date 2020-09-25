
package test;

public class Animal {
    {
        System.out.println("Animal Loaded");
    }
    int noOfLegs;

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "I am animal with " + noOfLegs + " legs";
    }
}