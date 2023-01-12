class Solution(object):
    def myPow(self, x, n):
        def pow(x, n):
            if(x == 0):
                return 0
            if(n == 0):
                return 1
            res = pow(x, n//2)
            res = res * res
            if(n % 2 > 0):
                return res * x
            else:
                return res
        res = pow(x, abs(n))
        if(n < 0):
            return 1/res
        else:
            return res
