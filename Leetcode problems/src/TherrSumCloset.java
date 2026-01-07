import java.util.Arrays;

public class TherrSumCloset {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int total = nums[i] + nums[j] + nums[k];
                if (total > target) {
                    k--;
                } else if (total < target) {
                    j++;
                } else {
                    count++;
                    j++;
                    while (nums[j] == nums[j-1] && j < k) {
                        j++;
                    }
                }
            }
        }
        return count;
    }

    static void main() {
        int[] nums={-1,2,1,-4};
        int a=threeSumClosest(nums,1);
        System.out.println(a);
    }
}
