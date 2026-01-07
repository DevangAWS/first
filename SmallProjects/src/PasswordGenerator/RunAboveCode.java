package PasswordGenerator;
import java.util.Random;
import java.util.Scanner;
class RunAboveCode{
    static void main() {
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
        SampleSpace space=new SampleSpace();
        System.out.print("enter the length of password you need: ");
        int size=scanner.nextInt();
        StringBuilder password= new StringBuilder();
        for (int i=0;i<size;i++) {
            int a= random.nextInt(0,4);
            switch (a){
                case 0:
                    password.append(space.randomLower());
                    break;
                case 1:
                    password.append(space.randomUpper());
                    break;
                case 2:
                    password.append(space.randomNumber());
                    break;
                case 3:
                    password.append(space.randomSymbol());
                    break;
            }
        }
        System.out.println("Your generated password is "+password);
    }
}
