class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> request = new HashMap<Integer,Integer>();

        for(int i =0 ; i < nums.length; i++)
        {
            if(request.get(target-nums[i])!= null){
                int[] result = new int[2];
                result[0] = request.get(target-nums[i]);
                result[1] = i;
                return result;
            }

            
           request.put(nums[i], i);
        }

        return new int[]{};
    }
}
