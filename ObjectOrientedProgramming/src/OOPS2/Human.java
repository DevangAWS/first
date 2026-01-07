package OOPS2;
public class Human {
    private int age;
    private String name;
    private int salary;
    private boolean married;
    static long people;
    static  int a=4;
    static int b;
    static {
        System.out.println("hello world!");
        b=a*5;
    }
    public Human(){};
    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        people += 1;
    }
}
class run{
    static void main() {
        Human one = new Human(22, "Devang", 220000000, false);
        Human two =new Human(20,"Disha",2200000,false);
        System.out.println(Human.people);
        Human lol = new Human();
        System.out.println(Human.a+" "+Human.b);
    }
}