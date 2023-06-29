class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        String s = "";

        if (nums.length == 0) {
            return list;
        }
        if(nums.length == 1) {
            list.add(Integer.toString(nums[0]));
            return list;
        }

        int len = nums.length, left = 0;


        for(int i = 0; i < len - 1; i++) {
            int temp = nums[left];
            if(nums[i + 1] - nums[i] != 1 && left != i) {
                list.add(temp + "->" + nums[i]);
                left = i + 1;
            } else if (nums[i + 1] - nums[i] != 1 && left == i) {
                list.add("" +temp);
                left = i + 1;
            }       
        }

        if(left != len - 1)
            list.add(nums[left] + "->" + nums[len - 1]);
        else
            list.add(Integer.toString(nums[len - 1]));
        
        return list;
    }
}
