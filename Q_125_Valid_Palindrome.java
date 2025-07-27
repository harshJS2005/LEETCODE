class Solution {
    public boolean isPalindrome(String s) {
        int left_index = 0;
        int right_index = s.length() - 1;
        while (left_index < right_index) {
            char left_char = s.charAt(left_index);
            char right_char = s.charAt(right_index);

            if (!Character.isLetterOrDigit(left_char)) {
                left_index++;
                continue;
            }
            if (!Character.isLetterOrDigit(right_char)) {
                right_index--;
                continue;
            }
            if (Character.toLowerCase(left_char) != Character.toLowerCase(right_char)) {
                return false;
            }
            left_index++;
            right_index--;
        }
        return true;
    }
}
