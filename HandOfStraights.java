class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) 
            return false;   

        Arrays.sort(hand);

        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int n : hand) 
            hm.put(n, hm.getOrDefault(n, 0) + 1);

        for(int n : hand) {
            if(hm.get(n) <= 0)
                continue;
            for(int i = 1; i < groupSize; i++) {
                int count = hm.getOrDefault(n + i, 0);
                if(count <= 0)
                    return false;
                else
                    hm.put(n + i, count - 1);
            }
            hm.put(n, hm.get(n) - 1);
        }
        return true;
    }
}
