class Solution {
    HashMap<Integer, Integer> hm = new HashMap<>();
    public int fib(int n) {
        if(n == 0)
            return 0;
        if(n == 1 || n == 2)
            return 1;
        if(hm.containsKey(n))
            return hm.get(n);
        int result = fib(n - 1) + fib(n - 2);
        hm.put(n, result);
        return result;
    }
} 
