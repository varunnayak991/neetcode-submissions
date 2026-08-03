class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        i = 0
        a = dict()
        for n in nums:
            if n in a :
                return [a[n], i]
            else:
                a[target-n] = i
            i = i + 1
            
        return list()
        