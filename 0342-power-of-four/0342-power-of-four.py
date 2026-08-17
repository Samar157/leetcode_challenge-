class Solution:
    def isPowerOfFour(self, n: int) -> bool:
        if n<0 : return False
        if n%3==1 and n&n-1 ==0 :
            return True
        return False