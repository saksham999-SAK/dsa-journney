class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        char[] mag = magazine.toCharArray();

        for (int i = 0; i < ransomNote.length(); i++) {

            boolean found = false;

            for (int j = 0; j < mag.length; j++) {

                if (ransomNote.charAt(i) == mag[j]) {
                    mag[j] = '#';   // Mark this character as used
                    found = true;
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