class Solution {
    double power(double b, int e) {
        // code here
        if(e == 0) return 1;
        
        long N = e;
        if(N<0){
            b=1/b;
            N=-N;
        }
        double result = 1;
        while(N>0){
            if(N%2==1){
                result = result*b;
            }
            b=b*b;
            N=N/2;
        }
        return result;
    }
}
