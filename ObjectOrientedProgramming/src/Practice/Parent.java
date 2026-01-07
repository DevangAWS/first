package Practice;

public abstract class Parent {
    abstract void career(String name);
    abstract void partner(String name, int age);
}

class Son extends Parent{
    @Override
    void career(String name){
        System.out.println("i am going to be a doctor");
    }
    void partner(String name, int age){
        System.out.println("i love my "+ name+" she is "+age+" years old");
    }
}

class runParentAbstract{
    static void main() {
        Son son= new Son();
        son.career("Doctor");
        son.partner("she",25);
    }
}
