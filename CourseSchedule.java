class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjList = new ArrayList<>();
        Set<Integer> cyclic = new HashSet<>();

        for(int i = 0; i < numCourses; i++) {
            adjList.add(new ArrayList());
        }

        for (int i = 0; i < prerequisites.length; i++) {
            int course = prerequisites[i][0];
            int prerequisite = prerequisites[i][1];
            adjList.get(course).add(prerequisite);
        }

        for(int i = 0; i < numCourses; i++) {
            if(!dfs(adjList, cyclic, i))
                return false;
        }
        return true;
    }

    public boolean dfs(List<List<Integer>> adjList, Set<Integer> cyclic, int curr) {
        if(cyclic.contains(curr))
            return false;
        if(adjList.get(curr).size() == 0)
            return true;

        cyclic.add(curr);   

        for (int i = 0; i < adjList.get(curr).size(); i++) {
            if(!dfs(adjList, cyclic, adjList.get(curr).get(i)))
                return false; 
        }
        cyclic.remove(curr);
        adjList.get(curr).clear();
        return true;
    }
}
