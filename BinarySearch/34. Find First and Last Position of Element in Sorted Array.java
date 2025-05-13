class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findfirst(nums, target);
        int last = findlast(nums, target);
        return new int[] { first, last };
    }

    private int findfirst(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                index = mid;
                right = mid - 1; // keep searching left
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return index;
    }

    private int findlast(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                index = mid;
                left = mid + 1; // keep searching right
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1; //  FIXED: this was previously incorrect
            }
        }

        return index; //  FIXED: moved outside the loop
    }
