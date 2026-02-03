import java.math.BigInteger;
import java.util.stream.LongStream;

public class ParallelFactorial {
    public static void main(String[] args) {
        int n = 50000;

        System.out.println("Calculating " + n + "! in Parallel...");
        long startTime = System.currentTimeMillis();

        // Using parallelStream to utilize all 16 threads of your Ryzen 7
        BigInteger result = LongStream.rangeClosed(1, n)
                .parallel()
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ONE, BigInteger::multiply);

        long endTime = System.currentTimeMillis();

        String resultStr = result.toString();
        System.out.println("Parallel Calculation took: " + (endTime - startTime) + " ms");
        System.out.println("Total Digits: " + resultStr.length());
    }
}