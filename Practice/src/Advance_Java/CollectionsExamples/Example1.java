package Advance_Java.CollectionsExamples;

import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<Students> students = new ArrayList<>();
        students.add(new Students("dev", 20, 1));
        students.add(new Students("dev1", 6546, 54));
        students.add(new Students("neq", 236, 47));
        students.add(new Students("mrdf", 27, 12));
        students.add(new Students("eww", 28, 18));

        Comparator<Students> comparator = (a, b) -> a.age < b.age ? 1 : -1;
        Collections.sort(students, comparator);
        System.out.println(students);
    }
}

class Students {
    String name;
    int age;
    int rollNo;

    public Students(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + rollNo;
    }
}