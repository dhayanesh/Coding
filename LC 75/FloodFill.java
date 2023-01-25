class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int clr = image[sr][sc];
        dfs(image, sr, sc, color, clr);
        return image;
    }

    public void dfs(int[][] image, int sr, int sc, int color, int clr) {
        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != clr || image[sr][sc] == color) {
            return;
        }

        image[sr][sc] = color;

        dfs(image, sr - 1, sc, color, clr);
        dfs(image, sr + 1, sc, color, clr);
        dfs(image, sr, sc - 1, color, clr);
        dfs(image, sr, sc + 1, color, clr);
    }
}
