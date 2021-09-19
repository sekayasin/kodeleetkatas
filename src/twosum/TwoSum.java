package twosum;

import java.util.Arrays;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        if (nums.length < 2) return null;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] + nums[i] == target) {
                    indices[0] = j;
                    indices[1] = i;
                    break;
                }
            }
        }
        return indices;
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        System.out.println(Arrays.toString(twoSum.twoSum(new int[] {2,7,11,15}, 9)));
    }

}
