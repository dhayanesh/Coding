class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points.length == 0)
            return 0;

        ArrayList<int[]> ans = new ArrayList<>();
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        ans.add(points[0]);
        
        for(int i = 1; i < points.length; i++) {
            int prevSt = ans.get(ans.size() - 1)[0];
            int prevEnd = ans.get(ans.size() - 1)[1];
            int currSt = points[i][0];
            int currEnd = points[i][1];
            if(currSt <= prevEnd) {
                int[] temp = new int[2];
                temp[0] = prevSt;
                temp[1] = Math.min(prevEnd, currEnd);
                ans.set(ans.size() - 1, temp);
            }
            else {
                ans.add(points[i]);
            }
        }
        return ans.size();
    }
}
