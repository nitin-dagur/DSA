class Solution {
    public int beautySum(String s) {
        int totalbeauty = 0;
        int n = s.length();

        for(int i =0;i<n;i++){
            int[] freq = new int[26];
            for(int j =i;j<n;j++){
                char ch = s.charAt(j);
                freq[ch-'a']++;
                int maxfreq=0;
                int minfreq=Integer.MAX_VALUE;

                for(int f : freq){
                    if(f>0){
                        maxfreq=Math.max(maxfreq,f);
                        minfreq=Math.min(minfreq,f);
                    }
                }
                totalbeauty += maxfreq-minfreq;
            }
        }
        return totalbeauty;
    }
}
