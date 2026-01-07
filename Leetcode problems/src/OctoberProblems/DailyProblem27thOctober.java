package OctoberProblems;

public class DailyProblem27thOctober {
    public int numberOfBeams(String[] bank) {
        int count=0;
        int i = 0;
        while (i < bank.length) {
            int a=noOfSystems(bank[i]);
            if (a==0) {
                i++;
                continue;
            }
            int j = i+1;
            while (j < bank.length) {
                int b=noOfSystems(bank[j]);
                if (b==0) {
                    j++;
                    continue;
                }
                count+=(a*b);
                i=j;
                break;
            }
            if (i==bank.length-1)break;
        }
        return count;
    }

    public int noOfSystems(String inputStringByUser){
        int count=0;
        for (int i = 0; i < inputStringByUser.length(); i++) {
            if (inputStringByUser.charAt(i)=='1')count++;
        }
        return count;
    }
}

class RunDailyProblem27thOctober{
    static void main() {
        String[] bank ={"000","111","000"};
        DailyProblem27thOctober problem27thOctober = new DailyProblem27thOctober();
        int a=problem27thOctober.numberOfBeams(bank);
        System.out.println(a);
    }
}