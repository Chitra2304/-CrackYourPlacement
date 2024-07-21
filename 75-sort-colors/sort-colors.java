// one pass :  Dutch National Flag problem algorithm
// 3 pointer
// Time complexity: O(n)
// Space complexity: O(1)

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = n-1;
        int id = 0;
        while(id<=r){
            if(nums[id]==0){              // id can only be 0 and 2
                int temp = nums[l];
                nums[l] = nums[id];
                nums[id] = temp;
                l++;
                id++;
            }
            else if(nums[id]==2){
                int temp = nums[r];
                nums[r] = nums[id];
                nums[id] = temp;
                r--;
            }
            else{                         // if id is 1
                id++;
            }
        }
    }
}


// https://youtu.be/yhlerbLPrOs?si=eldcwi1VldRuncrx


// The Dutch National Flag problem is a popular computer science problem proposed by Edsger Dijkstra. It involves sorting an array containing three different types of elements (often represented as 0, 1, and 2) in linear time and with a constant amount of space. The goal is to rearrange the elements so that all elements of the same type are adjacent, with the order of the types following a specified sequence (e.g., 0s, then 1s, then 2s).
