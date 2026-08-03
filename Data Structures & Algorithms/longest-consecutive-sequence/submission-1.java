class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> numberSet = new HashSet<>();

        for(int num : nums){
            numberSet.add(num);
        }

        int longestSequence = 0;
        int currentLongestSequence = 0;

        for(int num : nums)
        {
            if( (!numberSet.contains(num -1)) && numberSet.contains(num + 1)) // start
            {
                currentLongestSequence = 1;

                for(int i=1; i< nums.length; i++ )
                {
                    if(numberSet.contains(num + i))
                    {
                        currentLongestSequence++;
                    }
                    else
                    {
                        break;
                    }
                }
            }
            else
            {
                currentLongestSequence=1;
            }

            longestSequence = Math.max(longestSequence,currentLongestSequence);
        }

        return longestSequence;
    }
}
