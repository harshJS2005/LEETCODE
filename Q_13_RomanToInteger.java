class Solution {
    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            int currentValue = 0;
            switch (current) {
                case 'I':
                    currentValue = 1;
                    if (i + 1 < s.length()) {
                        char next = s.charAt(i + 1);
                        if (next == 'V') {
                            result += 4;
                            i++; 
                            continue;
                        } else if (next == 'X') {
                            result += 9;
                            i++; 
                            continue;
                        }
                    }
                    break;
                case 'X':
                    currentValue = 10;
                    if (i + 1 < s.length()) {
                        char next = s.charAt(i + 1);
                        if (next == 'L') {
                            result += 40;
                            i++;
                            continue;
                        } else if (next == 'C') {
                            result += 90;
                            i++;
                            continue;
                        }
                    }
                    break;
                case 'C':
                    currentValue = 100;
                    if (i + 1 < s.length()) {
                        char next = s.charAt(i + 1);
                        if (next == 'D') {
                            result += 400;
                            i++;
                            continue;
                        } else if (next == 'M') {
                            result += 900;
                            i++;
                            continue;
                        }
                    }
                    break;
                case 'V':
                    currentValue = 5;
                    break;
                case 'L':
                    currentValue = 50;
                    break;
                case 'D':
                    currentValue = 500;
                    break;
                case 'M':
                    currentValue = 1000;
                    break;
            }
            result += currentValue; 
        }
        return result;
    }
}
