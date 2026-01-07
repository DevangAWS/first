package Practice;

public class AbstractClass {
    public static abstract class Parent{
        int age;
        String career;
        String name;

        public Parent(int age, String career, String name) {
            this.age = age;
            this.career = career;
            this.name=name;
        }

        public abstract void career();
        public abstract void partner();
    }

    public static class Son extends AbstractClass.Parent {

        public Son(int age, String career, String name) {
            super(age, career, name);
        }

        @Override
        public void career() {
            System.out.println("my current occupation is "+career);
        }

        @Override
        public void partner() {
            System.out.println("my partner name is "+name+" her age is "+age);
        }
    }
}

class runAbstractClass{
    static void main() {
        AbstractClass.Son son=new AbstractClass.Son(25,"coder","Ritika");
        son.career();
        son.partner();
    }
}