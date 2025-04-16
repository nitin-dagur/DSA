class Solution {
    public int maxDepth(String s) {
        int currentdepth=0;
        int maxdepth=0;
        char[] arr=s.toCharArray();

        for(char c : arr){
            if(c=='('){
                currentdepth++;
                maxdepth=Math.max(currentdepth,maxdepth);
            }else if(c==')'){
                currentdepth--;
            }
        }
        return maxdepth;
        
    }
}