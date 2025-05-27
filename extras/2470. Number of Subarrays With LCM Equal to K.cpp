


class Solution {
public:
    // Helper function to calculate LCM
    long long lcm(long long a, long long b) {
        return (a * b) / gcd(a, b);
    }

    int subarrayLCM(vector<int>& nums, int k) {
        int count = 0;
        int n = nums.size();

        for (int i = 0; i < n; ++i) {
            long long currLCM = nums[i];
            if (currLCM == k) count++;

            for (int j = i + 1; j < n; ++j) {
                currLCM = lcm(currLCM, nums[j]);
                if (currLCM > k) break; // No need to continue
                if (currLCM == k) count++;
            }
        }

        return count;
    }
};
