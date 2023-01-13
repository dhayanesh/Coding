class Solution(object):
    def mySqrt(self, x):
        left = 0
        right = x
        while left <= right:
            mid = (left + right) / 2
            if(mid*mid == x):
                return mid
            elif(mid*mid < x):
                left = mid + 1
                res = mid
            else:
                right = mid - 1
        return res
