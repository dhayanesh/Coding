class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int start = 0;
        int end = numbers.length-1;

        while(start < end) {
            int i = numbers[start];
            int j = numbers[end];
            if(i+j == target)
                break;

            if(i+j < target)
                start++;
            else
                end--;

        }
        return new int[]{start+1, end+1};

    }
}
