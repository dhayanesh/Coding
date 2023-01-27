class Solution {
    public int titleToNumber(String columnTitle) {
        int colNum = 0;
        for(char c : columnTitle.toCharArray()) {
            colNum = colNum * 26;
            colNum = colNum + c - 'A' + 1;
        }
        return colNum;
    }
}
