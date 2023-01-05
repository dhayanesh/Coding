class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        subSet(nums, result, list, 0);
        return result;
    }

    public void subSet(int[] nums, List<List<Integer>> result, List<Integer> list, int st) {
        if (st >= nums.length) {
            result.add(new ArrayList<>(list));
        } else {
            list.add(nums[st]);
            subSet(nums, result, list, st + 1);
            list.remove(list.size() - 1);
            subSet(nums, result, list, st + 1);
        }

    }

}
