class Solution {
    public int characterReplacement(String s, int k) {
        // Array to store the frequency of each character in the current window (A-Z → 0-25)
        int[] count = new int[26];

        // Stores the highest frequency of a single character in the current window
        int maxCount = 0;

        // Left pointer for the sliding window
        int left = 0;

        // Stores the maximum length of a valid window found so far
        int maxLength = 0;

        // Iterate through the string using the right pointer
        for (int right = 0; right < s.length(); right++) {
            // Increment the frequency of the current character in the window
            count[s.charAt(right) - 'A']++;

            // Update maxCount if the current character's frequency is the highest so far
            maxCount = Math.max(maxCount, count[s.charAt(right) - 'A']);

            // Check if the current window is valid (number of changes needed > k)
            // If so, shrink the window from the left
            if ((right - left + 1) - maxCount > k) {
                // Reduce the count of the character going out of the window
                count[s.charAt(left) - 'A']--;
                // Move the left pointer to the right
                left++;
            }

            // Update the maximum valid window length found so far
            maxLength = Math.max(maxLength, right - left + 1);
        }

        // Return the maximum length of a valid window
        return maxLength;
    }
}
