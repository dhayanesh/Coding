/*
For any number, if it has a factor less than or equal to its square root, there will be a corresponding factor greater than or equal to its square root.

This is because for a number n, if it has a factor f less than or equal to its square root, then n/f will be a factor that is greater than or equal to its square root.
*/

class Solution {
    public int sumFourDivisors(int[] nums) {
        int totalSum = 0;
        for(int i = 0; i < nums.length; i++) {
            int sum = 0;
            int count = 0;
            for(int j = 1; j <= Math.sqrt(nums[i]); j++) {
                if(nums[i] % j == 0) {
                    if(nums[i] / j == j) {
                        sum += j;
                        count++;
                    } else {
                        sum += j + (nums[i] / j);
                        count += 2;
                    }
                }
            }
            
            if(count == 4)
                totalSum += sum;    
        }
        return totalSum;
    }
}
