class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = 1;

        for(int pile : piles)
            right = Math.max(right, pile);

        while(left < right) {
            int mid = (left + right) / 2;
            int time = 0;
            for(int pile : piles)
                time += Math.ceil((double)pile / mid);
            
            if(time > h)
                left = mid + 1;
            else
                right = mid;
        }
        return right;
    }
}
