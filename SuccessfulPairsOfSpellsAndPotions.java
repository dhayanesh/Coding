class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int len = spells.length, i = 0;
        int[] arr = new int[len];

        Arrays.sort(potions);

        for(int spell: spells) {
            int left = 0, right = potions.length - 1; 
            while(left <= right) {
                int mid = (left + right) / 2;
                if((long)spell * potions[mid] >= success)
                    right = mid - 1;
                else
                    left = mid + 1;
            }
            arr[i] = potions.length - left;
            i++;
        }
        return arr;
    }
}
