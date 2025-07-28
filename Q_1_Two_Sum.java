class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0 ; i < nums.length ; i++) {
            int num = nums[i];
            int remaining = target - num;

            if (numMap.containsKey(remaining)) {
                return new int[]{numMap.get(remaining),i};
            }
            numMap.put(num,i);
        }
        return new int[]{0,0};
    }
}
