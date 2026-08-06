class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;

        int low = 0;
        int high = heights.length-1;

        while(low < high)
        {
            int area = Math.min(heights[low], heights[high])*(high - low );

            if(area> maxArea)
            {
                maxArea = area;
            }

            if(heights[low] > heights[high])
            {
                high--;
            }
            else
            {
                low++;
            }

        }
        return maxArea;
    }
}
