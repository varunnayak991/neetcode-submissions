class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int low = 0;
        int high = numbers.length -1;

        while(low < high)
        {
            int result = numbers[low] + numbers[high];

            if(result == target)
            {
                return new int[]{low+1,high+1};
            }
            else if(result > target )
            {
                high--;
            }
            else if(result < target)
            {
                low++;
            }
        }

        return new int[]{};
    }
}
