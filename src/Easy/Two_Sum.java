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
        // this is the map where we will save the differences and the index where we found it
        HashMap<Integer, Integer> map = new HashMap<>();    //key= target - nums[i]   |   value= index

        for (int i = 0; i < nums.length; i++) {
            // if the map already contains the number as the key, we can return this
            if (map.containsKey(nums[i])) {
                // return the value of nums[i] and current index i
                return new int[]{map.get(nums[i]), i};
                // otherwise, we have to put it into the map
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
