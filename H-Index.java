class Solution {
    public int hIndex(int[] citations) {
        int len = citations.length;
        Arrays.sort(citations);
        int result = 0;
        for(int i = len - 1; i >= 0; i--) {
            if (citations[i] >= len - i) {
                result = len - i;
            } else {
                break;
            }
        }
        return result;
    }
}

//[3,0,6,1,5]
//Sorted: [0,1,3,5,6]
//Output: 3
