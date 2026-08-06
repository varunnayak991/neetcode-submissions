class Solution {
    public int trap(int[] height) {
        
        int[] prefixHeights = new int[height.length];

        int[] suffixHeights = new int[height.length];

        int maxHeight = 0;

        for(int i=0; i< height.length; i++)
        {
            if(height[i] > maxHeight)
            {
                maxHeight = height[i];

            }
            prefixHeights[i] = maxHeight;
        }

        maxHeight = 0;

        for(int i=height.length -1 ; i >= 0; i--)
        {
            if(height[i] > maxHeight)
            {
                maxHeight = height[i];

            }
            suffixHeights[i] = maxHeight;
        }

        int volume = 0;

        for(int i=1; i< height.length-1; i++)
        {
            int currentVolume = Math.min(prefixHeights[i], suffixHeights[i]) - height[i];

            if(currentVolume > 0) {
                volume = volume + currentVolume;
            }

        }

        return volume;
    }
}
