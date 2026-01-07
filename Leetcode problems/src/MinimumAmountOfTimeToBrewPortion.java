public class MinimumAmountOfTimeToBrewPortion {
    public static long minTime(int[] skill, int[] mana) {
        long time=0;
        for (int k=0; k< mana.length;k++) {
            long minimumTime=0;
            for (int i=0; i< skill.length; i++) {
                long totalTime = (long) mana[k]*skill[i];
                time += totalTime;
            }
            if (k< mana.length-1){
                long gap = timeGap(skill, mana[k+1]);
                minimumTime = time - gap;
                time = minimumTime;
            }

        }
        return time;
    }

    public static long timeGap(int[] skill, long mana){
        long gap=0;
        for (int i = 0; i < skill.length-1; i++) {
            gap+=mana*skill[i];
        }
        return gap;
    }

    static void main() {
        int[] skill = {1,5,2,4};
        int[] mana = {5,1,4,2};
        long a=minTime(skill,mana);
        System.out.println(a);
    }
}
