import java.math.BigInteger;
public class StackTest {
    public static void main(String[] args) {
        int n = 50000;

        System.out.println("Calculating " + n + "! ...");
        long startTime = System.currentTimeMillis();

        BigInteger result = calculate(n);

        long endTime = System.currentTimeMillis();

        // 50,000! has over 200,000 digits. We'll just print the length and the first/last few digits.
        String resultStr = result.toString();
        System.out.println("Calculation took: " + (endTime - startTime) + " ms");
        System.out.println("Total Digits: " + resultStr.length());
        System.out.println("Start: " + resultStr.substring(0, 10) + "...");
    }

    public static BigInteger calculate(int n) {
        BigInteger res = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
}
