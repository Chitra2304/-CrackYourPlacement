// learn this custom sorting syntax used here

class Solution {
    public int[] frequencySort(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> freq = new HashMap<>();
        Integer[] newNums = new Integer[n];

        for(int i=0; i<n; i++){
            freq.put(nums[i], freq.getOrDefault(nums[i],0)+1);
            newNums[i] = nums[i];
        }

        //custom sorting
        Arrays.sort(newNums , (a,b) -> {
            if(freq.get(a) != freq.get(b)){    //if freq of numbers are not equal then return in increasing order based on freq.
                return freq.get(a) - freq.get(b);
            }
            else{                             //otherwise sort them in decreasing order based on number in nums.
                return b - a;
            }
        });

        for(int i=0; i<n; i++){
            nums[i] = newNums[i];
        }

        return nums;
    }
}



// Time complexity: O(nlogn)
// Space complexity: O(n)