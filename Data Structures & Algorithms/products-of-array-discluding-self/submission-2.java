class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] preProduct = new int[nums.length];
        int[] postProduct = new int[nums.length];
        int[] result = new int[nums.length];


        int product = 1;
        for(int i=0; i<nums.length; i++)
        {
            product = product * nums[i];
            preProduct[i] = product;
        }

        product = 1;
        
        for(int i=nums.length-1; i>=0; i--)
        {
            product = product * nums[i];
            postProduct[i] = product;
        }

        result[0] = postProduct[1];
        for(int i=1; i<nums.length-1; i++)
        {
           result[i] = preProduct[i-1] *  postProduct[i+1];
        }
        result[nums.length-1] = preProduct[nums.length-2];

        return result;
        
    }
}  
