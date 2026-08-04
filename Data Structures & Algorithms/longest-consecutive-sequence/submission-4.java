class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for(int i : nums){
            seen.add(i);
        }

        if(nums.length == 0)
        {
            return 0;
        }

        int maxSequenceLength = 1;


        for(int n : nums){

            int i = 1;
            int currentSequenceLength = 1;

            if(seen.contains(n - 1))
            {
                continue;
            }

            while(seen.contains(n+i))
            {
                i++;
                currentSequenceLength++;
            }
            if(currentSequenceLength > maxSequenceLength)
            {
                maxSequenceLength = currentSequenceLength;
            }

        }

        return maxSequenceLength;
    }
}
