class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        diff_dict = {}
        i = 0
        for num in nums:
            if target - num in diff_dict:
                return [diff_dict[target - num],i]
            else:
                diff_dict[num] = i
            i = i+1
        return [-1,-1]



        