public class SmallerNumber {
    public static int findNthDigit(int n) {
        long digitInNum = 1, start = 1, end = 9;

        while (n > digitInNum * end) {
            n -= (int) (digitInNum * end);
            digitInNum++;
            start *= 10;
            end *= 10;
        }

        long num = start + (n - 1) / digitInNum;
        String numStr = Long.toString(num);
        return numStr.charAt((int) ((n - 1) % digitInNum)) - '0';
    }

    static void main() {
        int a=findNthDigit(11);
        System.out.println(a);
    }
}
