class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> anagrams = new HashMap<String,List<String>>();

        for(String str : strs)
        {
            char[] chars = str.toCharArray();
            int[] ints = new int[26];

            for( char c : chars)
            {
                ints[c - 'a'] ++;
            }

            String key = "";
            for( int i=0; i<26; i++)
            {
                key = key+"#"+ints[i];
            }

            //Arrays.sort(chars);
            //String key = new String(ints);
            anagrams.putIfAbsent(key, new ArrayList<String>());
            anagrams.get(key).add(str);
        }

        return new ArrayList<List<String>>(anagrams.values());

    }
}
