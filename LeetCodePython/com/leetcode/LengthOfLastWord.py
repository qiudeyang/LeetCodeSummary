#coding=utf-8
class Solution(object):
    def lengthOfLastWord(self, s):
        str = s.split()
        print str[len(str) - 1]

solution = Solution()
solution.lengthOfLastWord("Hello World")