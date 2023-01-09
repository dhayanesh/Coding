//Kadanes algorithm
class Solution {
    public int maxSubArray(int[] nums) {
        int result = Integer.MIN_VALUE, sum = 0;
        for(int n : nums) {
            sum = sum + n;
            if(sum < n)
                sum = n;
            if(sum > result)
                result = sum;
        }
        return result;
    }
}
