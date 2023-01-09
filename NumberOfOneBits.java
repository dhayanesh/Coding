public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
       String s = Integer.toBinaryString(n);
       int count = 0;
       for(char ch : s.toCharArray()) {
           if(ch == '1')
                count++;
       }
       return count;
    }
}
