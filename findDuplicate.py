class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        fast, slow = 0, 0
        while True:
            slow = nums[slow]
            fast = nums[nums[fast]]
            if slow == fast:
                break

        temp = 0
        while True:
            slow = nums[slow]
            temp = nums[temp]
            if slow == temp:
                return slow
