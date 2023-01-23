class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int middle = (left+right)/2;
//        int count = 0;
        while(left<=right)
        {
            if(target>nums[middle])
            {
                left = middle + 1;
            }
            else if(target<nums[middle])
            {
                right = middle - 1;     
            }
            if(target == nums[middle])
            {                    
                    return middle;
            }
            middle = (left+right)/2;
        }
        return -1;
    }
}
