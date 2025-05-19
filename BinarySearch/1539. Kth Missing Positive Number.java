class Solution {
    public int findKthPositive(int[] arr, int k) {
        for(int i = 0;i<arr.length;i++){ //time o(n),space o(1)
            if(arr[i]<=k){
                k++;

            }else{
                break;
            }
        }
        return k;
        
    }
}
