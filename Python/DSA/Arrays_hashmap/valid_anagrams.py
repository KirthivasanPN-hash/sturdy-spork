
'''
Approach:
Append the char to hashmap
compare the hashmap(dict)

TC: O(n)+O(n)+O(n) = O(n)
'''


class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """

        if len(s)!=len(t):
            return False

        count_s = {}
        count_t = {}
        for n in s:
            if n in count_s: 
                count_s[n]+=1
                
            else:
                count_s[n] = 1

        for v in t:
            if v in count_t: 
                count_t[v]+=1
                
            else:
                count_t[v] = 1
        
        if count_s == count_t:
            return True
        else:
            return False
