class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) 
            return 0;

        HashSet<Integer> set = new HashSet<>();
        for(int i : nums)
            set.add(i);

        List<Integer> list = new ArrayList<>();  
        for(int i : set)
            list.add(i);
        
        Collections.sort(list);
        int max = 1;
        int curr = 1;
        for(int i = 1; i < list.size(); i++) {
            if(list.get(i) - list.get(i - 1) == 1)
                curr += 1;
            else
                curr = 1;
            max = Math.max(max, curr); 
        }

        return max;

       
    }
}
