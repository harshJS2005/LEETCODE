class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }

        int j = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[j - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
