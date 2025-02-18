// https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> hs = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            Integer index = hs.get(target - nums[i]);
            if (index != null) {
                result[0] = index;
                result[1] = i;
                break;
            } else {
                hs.put(nums[i], i);
            }
        }
        return result;
    }
}
