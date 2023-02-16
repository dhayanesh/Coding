class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i] == nums[i - 1])
                continue;

            int target = nums[i];
            int left = i + 1, right = nums.length - 1;
            
            while(left < right) {
                List<Integer> list = new ArrayList<>();
                int sum = nums[i] + nums[left] + nums[right];
                if(sum > 0) 
                    right--;
                else if(sum < 0)
                    left++;
                else {
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    result.add(list);
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left - 1])
                        left++;
                    while(left < right && nums[right] == nums[right + 1])
                        right--;
                }
            }
        }
        return result;
    }
}
