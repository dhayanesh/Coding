class Solution {
    public int trap(int[] height) {
        //minimum of maximum left and right height minus current height
        int len = height.length;
        if(len == 0)
            return 0;

        int totalWater = 0;
        int[] maxLeft = new int[len];
        int[] maxRight = new int[len];
        
        int leftMax = 0;
        int rightMax = 0;
        maxLeft[0] = 0;
        maxRight[len - 1] = 0;

        for(int i = 1; i < len; i++) {
            leftMax = Math.max(leftMax, height[i - 1]);
            maxLeft[i]  = leftMax;
        }
        for(int i = len - 2; i >= 0; i--) {
            rightMax = Math.max(rightMax, height[i + 1]);
            maxRight[i] = rightMax;
        }

        for(int i = 0; i < len; i++){
            int water = Math.min(maxLeft[i], maxRight[i]) - height[i];
            if(water >= 0)
                totalWater += water;
        }
        return totalWater;
    }
}
