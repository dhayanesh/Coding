class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> list = new ArrayList<>();
        generateAll(new char[2 * n], list, 0);
        return list;
    }

    public void generateAll(char[] current, ArrayList<String> list, int pos) {
        if(pos == current.length) {
            boolean flag = checkParanthesis(current);
            if(flag) {
                list.add(new String(current));
            }
            return;
        }
        current[pos] = '(';
        generateAll(current, list, pos+1);
        current[pos] = ')';
        generateAll(current, list, pos+1);
    }

    public boolean checkParanthesis(char[] current) {
        int balance = 0;
        for (char c: current) {
            if (c == '(') 
                balance++;
            else 
                balance--;
            if (balance < 0) 
                return false;
        }
        return (balance == 0);
    }
}
