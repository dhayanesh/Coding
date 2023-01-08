//Solution 1 (0 ms):
class Solution {
    public int missingNumber(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i <= nums.length; i++) {
            sum1 = sum1 + i;
        }
        for(int i = 0; i < nums.length; i++) {
            sum2 = sum2 + nums[i];
        }        
        return sum1 - sum2;
    }
}

//Solution 2 (6 ms):
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != i)
                return i;
        }
        return nums[nums.length - 1] + 1;
    }
}
