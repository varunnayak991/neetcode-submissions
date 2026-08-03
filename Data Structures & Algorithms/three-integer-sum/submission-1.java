class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       
        Arrays.sort(nums);
         List<List<Integer>> result = new ArrayList<>();

        for(int i=0; i< nums.length; i++)
        {
            if(!(nums[i] <= 0)) // break for positive numbers
            {
                break;
            }

            if(i>0 && nums[i-1] == nums[i])
            {
                continue;
            }

            int l = i+1;
            int r = nums.length -1;

            while(l<r)
            {
                int sum = nums[i]+ nums[l] + nums[r];

                if(sum < 0)
                {
                    l = l + 1;
                }
                else if(sum > 0)
                {
                    r = r - 1;
                }
                else if(sum == 0)
                {
                    List<Integer> currentResult = new ArrayList<>();
                    currentResult.add(nums[i]);
                    currentResult.add(nums[l]);
                    currentResult.add(nums[r]);
                    result.add(currentResult);
                    l++;
                    r--;

                    while(l < nums.length && nums[l] == nums[l-1])
                    {
                        l++;
                    }

                    while(r > 0 && nums[r] == nums[r+1])
                    {
                        r--;
                    }
                }
            }

        }

        return result;
    }
}
