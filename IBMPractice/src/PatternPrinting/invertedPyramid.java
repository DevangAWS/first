package PatternPrinting;

import java.util.Scanner;

public class invertedPyramid {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of col:");
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a - i; j++) {
                if (i == 0 || i == j || i + j == 6) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}