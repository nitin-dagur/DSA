class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> Charset = new HashSet<>();

        int left = 0;
        int maxlength =0;

        for(int right =0;right<s.length();right++){
            
            
            while(Charset.contains(s.charAt(right))){
                Charset.remove(s.charAt(left));
                left++;
            }
            Charset.add(s.charAt(right));
            maxlength=Math.max(maxlength,right-left+1);
        }
        return maxlength;

        
    }
}
