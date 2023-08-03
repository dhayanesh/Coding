class Solution {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int[] arr = new int[len];

        int left = 0, right = len-1;

        for(int i = len - 1; i >= 0; i--) {
            if(Math.abs(nums[right]) > Math.abs(nums[left])) {
                arr[i] = nums[right] * nums[right];
                right--;
            } else {
                arr[i] = nums[left] * nums[left];
                left++;
            }
        }
        return arr;
    }
}
