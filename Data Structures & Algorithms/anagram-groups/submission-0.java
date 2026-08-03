class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        
        HashMap<String,ArrayList<String>> store = new HashMap<>();

        for(String input: strs)
        {
            char[]  key = input.toCharArray();
            Arrays.sort(key) ;
            String keyString = new String(key);

            if(store.containsKey(keyString))
            {
                ArrayList<String> strings= store.get(keyString);
                strings.add(input);
                store.put(keyString,strings);
            }
            else
            {
                ArrayList<String> strings= new ArrayList<>();
                strings.add(input);
                store.put(keyString,strings);
            }
        }

        List<List<String>> result = new ArrayList<>();
        for( ArrayList<String> strings : store.values()){
            result.add(strings);
        }

        return result;
        
    }
}
