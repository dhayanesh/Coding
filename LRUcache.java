import java.util.LinkedHashMap;

class LRUCache {
    LinkedHashMap<Integer, Integer> lhm;

    public LRUCache(int capacity) {
        lhm = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest)
            {
                return size() > capacity;
            }
        };
    }
    
    public int get(int key) {
        return lhm.getOrDefault(key, -1);
    }
    
    public void put(int key, int value) {
        lhm.put(key, value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
