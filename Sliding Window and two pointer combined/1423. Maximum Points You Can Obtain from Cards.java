class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftsum = 0;
        int maxsum = 0;

        // Take first k cards from the start
        for (int i = 0; i < k; i++) {
            leftsum += cardPoints[i];
        }
        maxsum = leftsum;

        // Start taking cards from the end one by one, replacing from the start
        int rightsum = 0;
        int n = cardPoints.length;
        for (int i = k - 1; i >= 0; i--) {
            leftsum -= cardPoints[i];               // Remove from start
            rightsum += cardPoints[n - (k - i)];    // Add from end
            maxsum = Math.max(maxsum, leftsum + rightsum);  // Update max
        }

        return maxsum;
    }
}
