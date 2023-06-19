import java.util.*;

class Solution {
    public int[][] kClosest(int[][] points, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        HashMap<Integer, List<int[]>> map = new HashMap<>();

        for(int i = 0; i < points.length; i++) {
            int distance = points[i][0]*points[i][0] + points[i][1]*points[i][1];

            if(!map.containsKey(distance)){
                map.put(distance, new ArrayList<int[]>());
            }
            map.get(distance).add(points[i]);
            
            pq.add(distance);
        }

        int[][] result = new int[K][2];
        int i = 0;

        while(i < K) {
            List<int[]> list = map.get(pq.poll());
            for(int j = 0; j < list.size() && i < K; j++){
                result[i] = list.get(j);
                i++;
            }
        }

        return result;
    }
}
