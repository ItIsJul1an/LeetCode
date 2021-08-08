package Easy;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Input: nums = [2,7,11,15], target = 9 <br>
 * Output: [0,1] <br>
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1]. <br>
 */

public class Two_Sum {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int left = map.get(nums[i]);
                return new int[]{left, i};
            } else {
                map.put(target - nums[i], i);
            }
        }
        return new int[2];
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
