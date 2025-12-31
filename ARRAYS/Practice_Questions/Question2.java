package ARRAYS.Practice_Questions;

/*
There is an integer array nums sorted in ascending order (with distinct values).Prior to being passed to your function, nums is possibly rotated at an unknown pivot  index k (1  <=  k  <  nums.length)  such  that  the  resulting  array  is [nums[k], nums[k+1],   ...,   nums[n-1], nums[0],   nums[1],   ...,   nums[k-1]] (0-indexed).   For   example, [0,1,2,4,5,6,7] might        be        rotated        at        pivot        index 3   and become [4,5,6,7,0,1,2].Given the array nums after the possible rotation and an integer target, returnthe index oftarget if it is in nums, or -1   if it is not in nums.You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input:nums = [4,  5, 6, 7, 0, 1, 2],
target = 0 
Output:   4 

Example 2:
Input:nums = [4,  5, 6, 7, 0, 1, 2], 
target = 3
Output:   -1 

Example 3:
Input:nums = [1], 
target = 0
Output:   -1 

Constraints:
•1 <= nums . lengtth <= 5000 
•-104 <= nums [ i ] <= 104
•All values of nums are unique.
•nums is an ascending array that is possibly rotated.
•-104 <= target <= 104


sujalrawat13@gmail.com
 */


public class Question2 {

    public static void main(String[] args) {

        Question2 obj = new Question2();

        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(obj.search(nums1, 0)); // 4

        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(obj.search(nums2, 3)); // -1

        int[] nums3 = {1};
        System.out.println(obj.search(nums3, 0)); // -1
    }

    public int search(int[] nums, int target) {
        int min = minSearch(nums);

        if (nums[min] <= target && target <= nums[nums.length - 1]) {
            return binarySearch(nums, min, nums.length - 1, target);
        } else {
            return binarySearch(nums, 0, min - 1, target);
        }
    }

    public int binarySearch(int[] nums, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public int minSearch(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
