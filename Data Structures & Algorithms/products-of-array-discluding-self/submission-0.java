class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] prefixArray = new int[nums.length];

        int prefixProduct = 1;

        // 1, 1*a[0], 1* a[1]
        prefixArray[0] = 1;

        for( int i = 1; i < nums.length; i++)
        {
            prefixProduct = prefixProduct * nums[i-1];
            prefixArray[i] = prefixProduct;
        }

        System.out.println(Arrays.toString(prefixArray));

        int postFixProduct = 1;


        for(int i= nums.length -1 ; i >=0; i-- )
        {
            prefixArray[i] = prefixArray[i] * postFixProduct;
            postFixProduct = postFixProduct *nums[i];
        }

        return prefixArray;

    }
}  
