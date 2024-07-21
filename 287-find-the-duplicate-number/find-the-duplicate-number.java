// counting frequency of each number in nums[]

class Solution {
    public int findDuplicate(int[] nums) {
        int[] integers = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            integers[nums[i]]++;
        }

        for(int i=1; i<=nums.length; i++){
            if(integers[i] > 1){
                return i;
            }
        }
        return -1;
    }
}