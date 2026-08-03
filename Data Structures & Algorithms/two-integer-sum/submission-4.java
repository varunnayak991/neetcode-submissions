class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> storageHash = new HashMap<>();

        int index = 0;

        for(int item : nums)
        {
            int pair = target - item;

            if(storageHash.containsKey(pair))
            {
                return new int[]{storageHash.get(pair),index};
            }

            storageHash.put(item,index);
            index++;
        }
        return new int[]{};
        
    }


}
