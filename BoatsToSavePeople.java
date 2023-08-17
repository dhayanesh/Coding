class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int count = 0, prev = 0, left = 0, right = people.length - 1;
        Arrays.sort(people);
        while(left <= right) {
            int remain = limit;
            if(people[right] <= limit) {
                remain = remain - people[right];
                right--;
                count++;
            }
            if(left <= right && people[left] <= remain) {
                remain = remain - people[left];
                left++;
                if(count == prev)
                    count++;
            }
            prev = count;
        }
        return count;
    }
}
