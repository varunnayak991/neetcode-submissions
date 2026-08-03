class Solution {
    public int trap(int[] height) {
                //System.out.println(Arrays.toString(height));
        int[] prefixes = new int[height.length];

        int[] suffixes = new int[height.length];

        int lastPrefixMax = height[0];
        for ( int i=0; i <height.length; i++)
        {
            lastPrefixMax = Math.max(height[i], lastPrefixMax);
            prefixes[i] = lastPrefixMax;
        }
        //System.out.println(Arrays.toString(prefixes));


        int lastSuffixMax = height[height.length-1];
        for ( int i=height.length-1; i >=0; i--)
        {
            lastSuffixMax = Math.max(height[i], lastSuffixMax);
            suffixes[i] = lastSuffixMax;
        }

        //System.out.println(Arrays.toString(suffixes));

        int totalResult = 0;
        for ( int i=0; i <height.length; i++)
        {
            totalResult = totalResult + ( Math.min(prefixes[i],suffixes[i]) - height[i]);
        }

        return totalResult;
    }
}
