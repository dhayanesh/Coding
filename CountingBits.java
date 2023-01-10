class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        for(int i = 0; i <= n; i++) {
            String binary = Integer.toBinaryString(i);
            int count = 0;
            for(char ch : binary.toCharArray()) {
                if(ch == '1')
                    count++;
            }
            result[i] = count;
        }
        return result;
    }
}
