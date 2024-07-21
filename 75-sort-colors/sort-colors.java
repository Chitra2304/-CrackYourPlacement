// two pass : counting occurrences of 3 colours and overwriting the nums array
// Time complexity: O(n)
// Space complexity: O(1)

class Solution {
    public void sortColors(int[] nums) {
        int[] counting = new int[3];
        for(int x : nums){    //counting occurrences
            counting[x]++;
        }

        int j = 0;           //overwriting the nums array
        for(int i=0; i<3; i++){
            while(counting[i]>0){
                nums[j] = i;
                j++;
                counting[i]--;
            }
        }
    }
}



// two pass solution:
// it effectively makes two passes over the array, resulting in an overall time complexity of O(2n), which simplifies to 
// O(n), but it's not a single pass.