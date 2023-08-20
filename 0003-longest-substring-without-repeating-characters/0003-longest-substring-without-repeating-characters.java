import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0; // To store the maximum length of substring without repeating characters
        int left = 0; // Left pointer of the sliding window
        int right = 0; // Right pointer of the sliding window
        HashSet<Character> seen = new HashSet<>(); // Set to keep track of characters in the current window

        while (right < s.length()) {
            if (!seen.contains(s.charAt(right))) {
                seen.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1); // Update maxLength
                right++; // Expand the window
            } else {
                seen.remove(s.charAt(left));
                left++; // Contract the window
            }
        }

        return maxLength;
    }
}
