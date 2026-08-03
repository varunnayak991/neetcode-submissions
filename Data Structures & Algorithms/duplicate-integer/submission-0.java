class Solution {
    public boolean hasDuplicate(int[] nums) {

    HashSet<Integer> hasInt = new HashSet<>();
	
    for(int num : nums)
	{
		hasInt.add(num);
	}

	return hasInt.size() != nums.length;
    }
}
