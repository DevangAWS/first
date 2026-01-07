package OctoberProblems;

import java.util.Arrays;

public class DailyProblem28thOctober {
    public int countValidSelections(int[] nums) {
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int left = sum(Arrays.copyOfRange(nums, 0, i));
                int right = sum(Arrays.copyOfRange(nums, i + 1, nums.length));
                if (left == right) count += 2;
                else if (Math.abs(left-right)==1) count+=1;
            }
        }
        return count;
    }

    public int sum(int[] nums){
        int count=0;
        for (int num : nums) {
            count += num;
        }
        return count;
    }
}

class RunDailyProblem28thOctober{
    static void main() {
        int[] nums={16,13,10,0,0,0,10,6,7,8,7};
        DailyProblem28thOctober dailyProblem28thOctober=new DailyProblem28thOctober();
        int a=dailyProblem28thOctober.countValidSelections(nums);
        System.out.println(a);
    }
}