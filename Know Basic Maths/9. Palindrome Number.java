class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int reverse =0;
        int y = x;
        while(x != 0){
            int digit = x%10;
            reverse = reverse*10 + digit;
            x=x/10;
        }
        if(reverse == y) return true;
        else return false;
        
    }
}
