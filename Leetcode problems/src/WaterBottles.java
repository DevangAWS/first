void main() {
    int a = numWaterBottles(9, 3);
    IO.println(a);
}

public static int numWaterBottles(int numBottles, int numExchange) {
    int count = 0;
    int empty=0;
    while (numBottles > 0) {
        count = count + numBottles;
        empty+=numBottles;
        numBottles=empty/numExchange;
        empty%=numExchange;
    }
    return count;
}