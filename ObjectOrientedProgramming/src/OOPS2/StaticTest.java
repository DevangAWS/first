package OOPS2;

public class StaticTest {
    static class lol{
        private static int a=5;
        public static int b;

        static {
            lol.b=a*2;
        }

        static void main() {
            System.out.println(b);
        }
    }

    static void main() {
        lol.main();
    }
}
