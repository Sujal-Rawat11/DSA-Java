package ARRAYS.Practice_Questions;

import java.util.*;

/*
Question 5 (DSA Sheet #16) – 3Sum Problem

This problem can be a little difficult for beginners to solve.
Please analyze the solution carefully if you are not able to
come up with the code on your own.

------------------------------------------------------------
Problem Statement:
------------------------------------------------------------
Given an integer array nums, return all the triplets
[i, j, k] such that:

• nums[i] + nums[j] + nums[k] == 0
• i != j, i != k, and j != k
• No duplicate triplets are allowed in the result

A triplet is simply a set of three numbers from the array.

Example:
If nums = [1, 2, 3, 4]
Possible triplets are:
[1,2,3], [1,2,4], [1,3,4], [2,3,4]

Invalid triplets:
[1,1,1], [1,1,2], [1,2,2] (reusing elements is not allowed)

Duplicate Triplet Rule:
For nums = [-2, -2, 0, 2]
Triplets [-2,0,2] formed from indices (0,2,3) and (1,2,3)
are considered the same.
Only ONE should appear in the final answer.

------------------------------------------------------------
Brute Force Approach:
------------------------------------------------------------
This approach uses:
• List to return the result
• HashSet to remove duplicate triplets

Steps:
1. Use three nested loops to generate all possible triplets.
2. For each triplet, calculate the sum.
3. If the sum is 0:
   - Sort the triplet
   - Add it to a HashSet to avoid duplicates
4. Convert the HashSet into a List.
5. Return the result.

Time Complexity:
O(n³)

Space Complexity:
O(k) where k is the number of unique triplets
*/



public class Practice5 {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        // Generate all possible triplets
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {

                    // Check if sum is zero
                    if (nums[i] + nums[j] + nums[k] == 0) {

                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);

                        // Sort to avoid duplicate triplets
                        Collections.sort(triplet);

                        result.add(triplet);
                    }
                }
            }
        }

        // Remove duplicate triplets
        result = new ArrayList<>(new LinkedHashSet<>(result));

        return result;
    }

    public static void main(String[] args) {

        Practice5 obj = new Practice5();  // Correct class name

        int[] nums = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> result = obj.threeSum(nums);

        System.out.println("Triplets with sum = 0:");
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
}
