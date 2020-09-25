package test;

import oops.Aeroplane;

public class Test {
    public static void main(String[] args) {
        // // Node n = new Node();
        // // n.a = 2;
        // // n.n = new Node();
        // // n.n.a = 3;
        // // n.n.n = new Node();
        // // n.n.n.a = 5;
        // // System.out.println(n.a);
        // // Node childNode = n;
        // // while ((childNode = childNode.n) != null) {
        // // System.out.println(childNode.a);
        // // }

        // String[] arr = new String[6];
        // arr[4] = "Hello";
        // arr[10] = "Xyz";
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }

        // /*
        // * arr.forEach((e:String)=>{ console.log(e) })
        // */

        // for (String e : arr) {
        // System.out.println(e);
        // }

        Integer x = 10;
        int y = 10;

        Animal h = new Herbivorous();
        h.noOfLegs = 4;

        Animal c = new Carnivorous();
        c.noOfLegs = 2;
        // c.eat();

        System.out.println(h.toString());
        System.out.println(c.toString());
        Aeroplane a = new Aeroplane();
    }

}