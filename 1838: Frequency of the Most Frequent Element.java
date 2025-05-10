class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        
        int left = 0,right = 0;
        long total = 0;
        int maxfreq = 0;
        while(right < nums.length){
            total = total + nums[right];

            while((long) nums[right]*(right - left + 1) > total + k){
                total = total - nums[left];
                left++;
            }
            maxfreq = Math.max(maxfreq,right - left + 1);
            right++;
        }
        return maxfreq;
        
    }
}
