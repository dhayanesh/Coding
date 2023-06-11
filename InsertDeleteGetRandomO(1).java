class RandomizedSet {
    public Map<Integer, Integer> map;
    public List<Integer> list;
    public Random rand;
    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
        rand = new Random();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val))
            return false;
        else {
            map.put(val, list.size());
            list.add(val);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if(!(map.containsKey(val)))
            return false;
        else {
            int idx = map.get(val);
            int lastIdx = list.size() - 1;
            if(idx != lastIdx) {
                int lastEle = list.get(list.size() - 1);
                list.set(idx, lastEle);
                map.put(lastEle, idx);
            }
            map.remove(val);
            list.remove(lastIdx);
            return true;
        }
    }
    
    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
