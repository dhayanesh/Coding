class Solution {
    public static boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        if (sum % 2 != 0) {
            return false;
        }

        sum /= 2;
        
        Set<Integer> set = new HashSet<>();
        set.add(0);

        for(int i = 0; i < nums.length; i++) {
            Set<Integer> temp = new HashSet<>();

            for(int n: set) {
                //sum of subsets
                temp.add(n + nums[i]);
                temp.add(n);
            }
            set = temp;
        }

        for(int n: set) {
            if(n == sum)
                return true;
        }
        return false;
    }
}
