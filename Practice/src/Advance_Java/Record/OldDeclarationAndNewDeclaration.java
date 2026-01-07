package Advance_Java.Record;

import java.util.Objects;

public class OldDeclarationAndNewDeclaration {
    static class Student { // old format
        private final String name;
        private final int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass())
                return false;
            Student student = (Student) o;
            return age == student.age && Objects.equals(name, student.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }
    }

    Student student = new Student("dev", 25);
    Student student1 = new Student("dev", 24);
}

record StudentGen(String name, int age) {

    private static int studentcount;

    public StudentGen {
        if (name == null)
            throw new IllegalArgumentException("name cannot be null");
        studentcount++;
    }

    public int getStudentcount() {
        return studentcount;
    }
} // new format

class NewDeclaration {
    static void main() {
        StudentGen s1 = new StudentGen("dev", 25);
        System.out.println(s1);
        System.out.println(s1.getStudentcount());
        StudentGen s2 = new StudentGen(null, 20);
        System.out.println(s2);
        System.out.println(s2.getStudentcount());
    }
}