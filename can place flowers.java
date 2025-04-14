class Solution {
    public boolean canPlaceFlowers(int[] flw, int n) {
        int count = 0;
        int len=flw.length;

        for(int i =0;i<len;i++){
            if(flw[i]==0){
                int prev;
                if(i==0){
                    prev=0;
                }else{
                    prev=flw[i-1];
                }

                int next;
                if(i==len-1){
                    next=0;
                }else{
                    next=flw[i+1];
                }

                if(prev==0 && next==0){
                    flw[i]=1;
                    count++;
                }
                if(count>=n) return true;
            }
        }
    return count>=n;
    }
}
