import java.util.Scanner;

public class HCF {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter 2 numbers:");
        long a=scanner.nextLong();
        long b=scanner.nextLong();
        while (a!=b){
            if (a>b)a-=b;
            else b-=a;
        }
        System.out.println(a);
    }
}
