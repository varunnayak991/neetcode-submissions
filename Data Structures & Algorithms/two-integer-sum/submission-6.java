class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> request = new HashMap<Integer,Integer>();

        for(int i =0 ; i < nums.length; i++)
        {
            if(request.get(target-nums[i])!= null){
                int[] result = new int[]{request.get(target-nums[i]), i};
                return result;
            }

            
           request.put(nums[i], i);
        }

        return new int[]{};
    }
}
