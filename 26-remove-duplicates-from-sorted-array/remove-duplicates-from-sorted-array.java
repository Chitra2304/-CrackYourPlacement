// this is not inplace solution

class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int[] unique = new int[n];

        int temp = 0;
        unique[temp++] = nums[0];  // The first element is always unique
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                unique[temp++] = nums[i];
            }
        }

        // Copy the unique elements back to the original array if needed
        for (int i = 0; i < temp; i++) {
            nums[i] = unique[i];
        }

        return temp;
    }
}
