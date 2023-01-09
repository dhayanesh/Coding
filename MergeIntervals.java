class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ans.add(intervals[0]);

        for(int i = 1; i < intervals.length; i++) {
            int prevSt = ans.get(ans.size() - 1)[0];
            int prevEnd = ans.get(ans.size() - 1)[1];
            int currSt = intervals[i][0];
            int currEnd = intervals[i][1];
            if(currSt <= prevEnd) {
                int[] temp = new int[2];
                temp[0] = prevSt;
                temp[1] = Math.max(prevEnd, currEnd);;
                ans.set(ans.size() - 1, temp);               
            }
            else {
                ans.add(intervals[i]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
