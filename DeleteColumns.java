class Solution {
    public int minDeletionSize(String[] strs) {
        int count = 0;
        int n = strs[0].length();
        int m = strs.length;
        for(int i = 0; i < n; i++) {

            StringBuffer  temp1 = new StringBuffer();
            StringBuffer  temp2 = new StringBuffer();
            ArrayList<Character> ch = new ArrayList<>();

            for(int j = 0; j < m; j++) {
                ch.add(strs[j].charAt(i));
            }

            for(char h : ch)
                temp1.append(h);

            Collections.sort(ch);

            for(char h : ch)
                temp2.append(h);

            String temp11 = temp1.toString();
            String temp22 = temp2.toString();
            if(!temp11.equals(temp22))      
                count++;      
        }
        return count;

    }
}
