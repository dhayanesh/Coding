class Solution {
    HashMap<String, Integer> hm = new HashMap<>();
    public int uniquePaths(int m, int n) {
        return pathFinder(m,n,hm);
    }

    public int pathFinder(int m, int n, HashMap <String, Integer> hm) {
        if(m == 0 || n == 0)
            return 0;
        if(m == 1 || n == 1)
            return 1;
        String key = "" + m + "," + n;
        if(hm.containsKey(key))
            return hm.get(key);
        int res = pathFinder(m - 1, n, hm) + pathFinder(m, n - 1, hm);
        hm.put(key, res);
        return res;
    }
}
