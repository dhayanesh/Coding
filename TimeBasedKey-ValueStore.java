class TimeMap {
    HashMap<String, List<Pair<String, Integer>>> hm;

    public TimeMap() {
        hm = new HashMap();
    }

    public void set(String key, String value, int timestamp) {
        if (!hm.containsKey(key)) {
            hm.put(key, new ArrayList<>());
        }
        hm.get(key).add(new Pair<>(value, timestamp));
    }

    public String get(String key, int timestamp) {
        if (!hm.containsKey(key)) {
            return "";
        }
        List<Pair<String, Integer>> list = hm.get(key);

        //can directly loop through or perform binary search
        int left = 0, right = list.size() - 1;
        String res = "";

        while (left <= right) {
            int mid = left + (right - left) / 2;

            //getKey() if need first value (here String) in Pair<String, Integer>
            if (list.get(mid).getValue() <= timestamp) {
                res = list.get(mid).getKey();
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return res;
    }
}
