class Solution {
    public boolean isHappy(int n) {
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        while(sum != 1 && n > 0) {
            while(n != 0) {
                int rem = n % 10;
                sum = (rem * rem) + sum;
                n = n / 10;
            }

            if(sum == 1)
                return true;
            
            n = sum;

            if(set.contains(sum))
                return false;
            else
                set.add(sum);
            sum = 0;
        }
        return false;
    }
}
