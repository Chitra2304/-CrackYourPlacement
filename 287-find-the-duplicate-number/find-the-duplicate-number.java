// ways :
// 1. Brute Force (gives TLE) : Time:O(n^2)   Space:O(1)
// 2. Sorting : Time:O(n*logn)   Space:O(1)
// 3. HashSet : Time:O(n)   Space:O(n)
// 4. Boolean array : Time:O(n)   Space:O(n)
// 5. Mark visited element negative : Time:O(n)   Space:O(1)
// 6. Counting frequency : Time:O(n)   Space:O(n)
// 7. Binary search : Time:O(nlogn)    Space:O(1)
// 8. Bit manipulation : Time:O(nlogn)    Space:O(1)
// but all these are either modifying the array or not using constant extra space

// 9. Fast and Slow Pointers : Time:O(n)   Space:O(1)
// this approach 9 satisfies all the restrictions



//Learn (Fast and Slow Pointers) --->(Hare and Tortoise Algo)---> (Cycle detection in linked list)
class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}



// https://youtu.be/wiOo4DC5GGA?si=LlIgs66jt6gYNehf ---> for ll cycle detection
// https://youtu.be/qNx2nKBdvwU?si=suF-6ShkzjcPFbJP