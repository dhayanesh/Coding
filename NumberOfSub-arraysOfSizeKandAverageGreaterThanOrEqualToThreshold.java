class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0, window = 0, currSum = 0, left = 0;
        if(arr.length < k)
            return 0;

        for(int i = 0; i < k; i++) {
            currSum += arr[i];
        }
        if(currSum/k >= threshold)
            count++;

        for(int i = k; i < arr.length; i++) {
            currSum -= arr[left++];
            currSum += arr[i];
            if(currSum/k >= threshold)
                count++;
        }

        return count;
    }
}
