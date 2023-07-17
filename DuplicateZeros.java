class Solution {
    public void duplicateZeros(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            if(arr[i - 1] == 0) {
                int temp = arr[i];
                for (int j = i + 1; j < arr.length; j++) {
                    int curr = arr[j];
                    arr[j] = temp;
                    temp = curr;
                }
                arr[i] = 0;
                i++;
            }
        }
    }
}
