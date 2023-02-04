class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i = nums.length - 1; i >=0; i--) {
            int n = nums[i];
            while(n != 0) {
                int temp = n % 10;
                list.add(temp);
                n = n/10;
            }
        }
        Collections.reverse(list);
        int[] arr = new int[list.size()];
        int i = 0;
        for(int n : list) {
            arr[i] = n;
            i++;
        }  

        return arr;
    }
}
