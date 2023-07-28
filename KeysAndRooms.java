class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];

        dfs(rooms, visited, 0);

        for(boolean visit: visited) {
            if(!visit)
                return false;
        }
        return true;
    }

    public void dfs(List<List<Integer>> rooms, boolean[] visited, int current) { 
        visited[current] = true;       
        for(int i = 0; i < rooms.get(current).size(); i++) {
            if(!visited[rooms.get(current).get(i)])
                dfs(rooms, visited, rooms.get(current).get(i));
        }
    }
}Keys and Rooms
