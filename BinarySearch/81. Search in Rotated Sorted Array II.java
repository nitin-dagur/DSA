class Solution {
    public boolean search(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key) return true;

            if (arr[left] == arr[mid] && arr[mid] == arr[right]) {//to skip the duplicate
                left++;
                right--;
            }//to check that left side is sorted
            else if (arr[left] <= arr[mid]) {
                if (arr[left] <= key && key < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }//checks if right side is sorted
            else {
                if (arr[mid] < key && key <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return false;
    }
}
