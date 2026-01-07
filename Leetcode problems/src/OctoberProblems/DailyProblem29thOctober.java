package OctoberProblems;

public class DailyProblem29thOctober {
    public int smallestNumber(int n) {
        int count=1;
        int base=2;
        if(base<=1){
            System.out.println("Invalid base");
            return n+1;
        }
        if (n<1)return 1;
        for (int i=n;i>0;i/=base) {
            count*=base;
        }
        return count-1;
    }
}

class RunDailyProblem29thOctober{
    static void main() {
        DailyProblem29thOctober dailyProblem29thOctober=new DailyProblem29thOctober();
        int a= dailyProblem29thOctober.smallestNumber(30000);
        System.out.println(a);
    }
}
