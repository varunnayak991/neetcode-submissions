class Solution {
    public int trap(int[] height) {
                //System.out.println(Arrays.toString(height));
       int l = 0;
        int r = height.length -1;
        int maxLeft = height[l];
        int maxRight= height[r];
        int result = 0;

        while(l<r)
        {
            if(height[l] < height[r])
            {
                maxLeft = Math.max(maxLeft,height[l]);
                result = result + (maxLeft - height[l]);
                l++;

            }
            else
            {
                maxRight = Math.max(maxRight,height[r]);
                result = result + (maxRight - height[r]);
                r--;
            }
        }

        return result;

    }
}
