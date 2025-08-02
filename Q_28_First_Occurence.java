class Solution {
    public int strStr(String haystack, String needle) {
        int hayLength = haystack.length();
        int needLength = needle.length();

        for (int i = 0 ; i <= hayLength - needLength ; i++) {
            boolean equal = true ;
            for (int j = 0 ; j < needLength ; j++) {
                if (haystack.charAt(i+j) != needle.charAt(j)) {
                    equal = false;
                    break;
                }
            }
            if (equal == true) {
                return i;
            }
        }
        return -1;
    }
}
