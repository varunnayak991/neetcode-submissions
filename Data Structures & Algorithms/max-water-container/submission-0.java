class Solution {
    public int maxArea(int[] heights) {
        
        int l = 0;
        int r = heights.length -1;

        int maxArea = 0;

        while (l < r) {

            int minHeight = Math.min(heights[l], heights[r]);

            int width = r - l;

            int area = width * minHeight;

            maxArea = Math.max(maxArea, area);

            if (heights[l] <= heights[r]) {
                l++;
            } else if (heights[l] > heights[r]) {
                r--;
            }

        }
        return maxArea;
    }
}
