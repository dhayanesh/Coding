class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int n : arr)
            hm.put(n, hm.getOrDefault(n, 0) + 1);

        HashSet<Integer> hs = new HashSet<>();
        for (Map.Entry<Integer, Integer> entry : hm.entrySet())
            hs.add(entry.getValue());

        if(hs.size() == hm.size())
            return true;
        else
            return false;
    }
}
