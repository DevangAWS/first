package Advance_Java.Annotations;
class Cat {
    @Important(
            value = "High",
            priority = 2
    )
    public void meow() {
        System.out.println("Meow");
    }

    public void sleep() {
        System.out.println("Sleep");
    }
}