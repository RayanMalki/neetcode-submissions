class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        my_set = set()

        for num in nums:
            result = num in my_set
            my_set.add(num)
            
            if result:
                return True

        return False
            
