class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] arr = t.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            boolean found = false;

            for (int j = 0; j < arr.length; j++) {
                if (ch == arr[j]) {
                    found = true;
                    arr[j] = '#';      // mark this character as used
                    break;
                }
            }

            if (!found) {
                return false;
            }
        }

        return true;
    }
}