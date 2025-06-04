class Solution {
    public int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int digit = x % 10;  // Get the last digit

            
            if (rev > Integer.MAX_VALUE/10) {
                return 0; // Overflow case
            }
            if (rev < Integer.MIN_VALUE/10) {
                return 0; // Underflow case
            }

            // Add the digit to rev
            rev = rev * 10 + digit;

            // Remove the last digit
            x = x / 10;
        }

        return rev;
    }
}
