class Solution {
public List<List<Integer>> combinationSum2(int[] nums, int target) {
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    Arrays.sort(nums);
    backtrack(list, temp, nums, target, 0);
    return list;
}

private void backtrack(List<List<Integer>> list, List<Integer> temp, int [] nums, int remain, int start){
    if(remain < 0) 
        return;
    else if(remain == 0) 
        list.add(new ArrayList<>(temp));
    else{ 
        for(int i = start; i < nums.length; i++){
            if(i > start && nums[i] == nums[i - 1])
                continue;
            temp.add(nums[i]);
            backtrack(list, temp, nums, remain - nums[i], i+1);
            temp.remove(temp.size() - 1);
        }
    }
}
}
