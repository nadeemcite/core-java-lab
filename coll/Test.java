package coll;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        // ArrayList<Integer> intList = new ArrayList<Integer>();

        // intList.add(6);
        // intList.add(4);
        // intList.add(3);

        // intList.add(2, 9);

        // for (int a : intList) {
        // System.out.println(a);
        // }

        /*
         * List -> Interface from Collection Framework, Student -> Type of Item in
         * collection stuList -> refrence of Collection, ArrayList -> Type of Collection
         */
        List<Student> stuList = new ArrayList<Student>();

        stuList.add(new Student(3, "Azeem"));
        stuList.add(new Student(1, "Nadeem"));
        stuList.add(new Student(2, "Gaurav"));
        stuList.add(new Student(2, "Gaurav"));
        stuList.add(new Student(4, "Dory"));
        // Collections.sort(stuList);
        // for (Student s : stuList) {
        // System.out.println(s);
        // }
        // Set<Student> sSet = new HashSet<Student>();
        // sSet.addAll(stuList);

        stuList.addAll(stuList);

        System.out.println(stuList);

        // HashSet<Integer> intSet = new HashSet<Integer>();

        // intSet.add(9);
        // intSet.add(8);
        // intSet.add(1);
        // intSet.add(7);
        // intSet.add(3);
        // intSet.add(1);
        // intSet.add(7);

        // System.out.println(intSet);

        // Set<String> stringSet = new TreeSet<String>();

        // stringSet.add("Nadeem");
        // stringSet.add("Gaurav");
        // stringSet.add("Dory");
        // stringSet.add("Azeem");
        // stringSet.add("Dory");
        // stringSet.add("nadeem");

        // System.out.println(stringSet);

        // Set<Student> studentSet = new TreeSet<Student>();
        // studentSet.add(new Student(2, "azeem"));
        // studentSet.add(new Student(1, "Nadeem"));
        // studentSet.add(new Student(3, "Gaurav"));
        // studentSet.add(new Student(4, "Dory"));

        // studentSet.remove(new Student(4, "Dory"));
        // System.out.println(studentSet);

        // List<Student> stuLL = new LinkedList<Student>();
        // stuLL.remove(o)

    }
}