class Solution {
    static final int MOD = 1_000_000_007;

    public int countGoodNumbers(long n) {
        long evenposition = mypow(5, (n + 1) / 2, MOD);
        long oddposition = mypow(4, n / 2, MOD); // Also fix: odd positions should use 4, not 5

        return (int)((evenposition * oddposition) % MOD);
    }

    public long mypow(long x, long n, int MOD) {
        long result = 1;
        x = x % MOD;
        while (n > 0) {
            if (n % 2 == 1) {
                result = (result * x) % MOD;
            }
            x = (x * x) % MOD;
            n = n / 2;
        }
        return result;
    }
}
