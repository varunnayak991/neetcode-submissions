class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> anagrams = new HashMap<String,List<String>>();

        for(String str : strs)
        {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            anagrams.putIfAbsent(key, new ArrayList<String>());
            anagrams.get(key).add(str);
        }

        return new ArrayList<List<String>>(anagrams.values());

    }
}
