class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[nums.length * 2];
        int i = 0;
        for(int n : nums) {
            arr[i] = n;
            arr[i + nums.length] = n;
            i++;
        }   
        return arr;
    }
}
