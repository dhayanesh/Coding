class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> hm = new HashMap<>();

        for(int n: nums) {
            hm.put(n, hm.getOrDefault(n, 0) + 1);
            int count = hm.get(n);
            if(count == 2)
                list.add(n);
            if(count > 2) {
                list.remove(n);
            }
        }
        return list;
    }
}
