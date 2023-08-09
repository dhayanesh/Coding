class Solution {
    public boolean judgeCircle(String moves) {
        int[] pos = {0, 0};

        for(char ch: moves.toCharArray()) {
            if(ch == 'U')
                pos[0] += 1;
            if(ch == 'D')
                pos[0] -= 1;
            if(ch == 'R')
                pos[1] += 1;
            if(ch == 'L')
                pos[1] -= 1;
        }

        for(int n: pos) {
            if(n != 0)  
                return false;
        }

        return true;
    }
}
