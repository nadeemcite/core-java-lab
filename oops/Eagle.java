package oops;

public class Eagle extends Bird implements CanFly {
    @Override
    public void fly() {
        System.out.println("I can fly very high");
    }

}
