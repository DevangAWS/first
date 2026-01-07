package Advance_Java.LambdaPractice;

public class demo{
    public static void main(String[] args) {
        practiceAdvance.A objA= Integer::sum;
        int addition=objA.add(5,5);
        System.out.println(addition);
        practiceAdvance.B objB=(a, b)-> a-b;
        int subtraction= objB.sub(10,5);
        System.out.println(subtraction);
        practiceAdvance.C objC= (a, b)-> a*b;
        int multiplication= objC.mul(10,5);
        System.out.println(multiplication);
        try {
            practiceAdvance.D objD= (a, b)-> a/b;
            int division= objD.div(10,0);
            System.out.println(division);
        } catch (RuntimeException e) {
            System.out.println("Exception: You cannot divide by zero");
        }
        practiceAdvance.E objE= (a, b)-> a%b;
        int remainder= objE.rem(11,5);
        System.out.println(remainder);
    }
}