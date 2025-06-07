class Solution {//brute force
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];

        for(int i =0;i<nums1.length;i++){
            int num = nums1[i];

            int index = -1;

            for(int j = 0;j<nums2.length;j++){
                if(nums2[j]==num){
                    index = j;
                    break;

                }
                
            }
            int nextgreater = -1;
            for(int j = index +1;j<nums2.length;j++){
                if(nums2[j]>num){
                    nextgreater = nums2[j];
                    break;

                }
            }
            result[i] = nextgreater;
        }
        return result;
        
    }
}
//Create a result array to store the next greater elements for each value in nums1.

//Loop through each element in nums1:

//Let the current element be num.

//Find the index of num in nums2.

//From that index onward, iterate through the rest of nums2 to find the first number greater than num.

//If found, store that number in the result array.

//If not found, store -1.

//Return the result array after processing all elements.
