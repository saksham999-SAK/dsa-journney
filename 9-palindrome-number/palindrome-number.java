import java.util.Arrays;

class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0) return false;

        String numStr = Integer.toString(x);
        int[] digits = new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }

        int l = 0;
        int r = digits.length - 1;

        while (l < r) {
            if (digits[l] != digits[r]) {
                return false;
            }
            l++;
            r--;
        }

        return true;
    }
}
