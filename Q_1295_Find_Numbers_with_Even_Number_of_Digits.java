class Solution {
    public int findNumbers(int[] nums) {
        int evenDigitNumbers = 0; 
        for (int num : nums) {
            String s = String.valueOf(num);
            if (s.length() % 2 == 0) {
                evenDigitNumbers++;
            }
        }
        return evenDigitNumbers;
    }
}
