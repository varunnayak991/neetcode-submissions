class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        r = dict()
        for c in s:
            if c in t :
                if c in r :
                    i = r[c]
                    r[c] = i + 1
                else:
                    r[c] = 1
            else:
                return False
                # t contains c - add c

         # t does not contain c return false
        for c in t:
            if c in r :
                i = r[c]
                r[c] = i - 1
            else:
                return False

        for (k, v) in r.items():
            if v > 0:
                return False

            # check length of r and t to be same
        return True  # len(r) == len(t)
    
        