class Solution {
    int min = Integer.MAX_VALUE;
    Map <Integer, Integer> hm = new HashMap<>();

    public int numSquares(int n) {
        dfs(n, 0);
        return min;
    }

    void dfs(int n, int count) {
        if(n < 0 || count >= min)
            return;
        if(n == 0){
            min = Math.min(min, count);
            return;
        }
        if(hm.containsKey(n)){
            min = Math.min(min, count + hm.get(n));
            return;
        }
        for(int i = 1; i * i <= n; i++) {
            dfs(n - i * i, count + 1);
        }
        if(!hm.containsKey(n) || hm.get(n) > min - count) {
            hm.put(n, min - count);
        }
    }
}
