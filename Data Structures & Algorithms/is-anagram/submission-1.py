class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        char_dict = {}

        for c in s:
            char_dict[c] = char_dict.get(c,0)+1

        for c in t:
            if char_dict.get(c,0) == 0 :
                return False
            else:
                char_dict[c] = char_dict.get(c) - 1
        for c in char_dict:
            if char_dict.get(c) != 0 :
                return False
        return True