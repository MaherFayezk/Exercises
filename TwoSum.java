import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                break;
            }
            map.put(nums[i], i);
        }

        // for (int i = 0; i < nums.length; ++i) {
        // if (!map.containsKey(nums[i])) {
        // map.put(nums[i], i);
        // } else if (target == nums[i] * 2) {
        // result[0] = map.get(nums[i]);
        // result[1] = i;
        // return result;
        // }
        // }
        // map.forEach((k, v) -> System.out.println("key " + k + " value " + v));

        // for (int key : map.keySet()) {
        // if (map.containsKey(target - key)) {
        // result[0] = map.get(key);
        // result[1] = map.get(target - key);
        // break;
        // }
        // }

        return result;
    }
}
