class Solution {

    public String encode(List<String> strs) {

        List<String> input = strs;
        StringBuilder encodedString = new StringBuilder();

        for(String string : input)
        {
            encodedString.append(string.length());
            encodedString.append("#");
            encodedString.append(string);
        }

        return  encodedString.toString();

    }

    public List<String> decode(String str) {
        
        String input = str;
        List<String> resultStrings  = new ArrayList<String>();
        int index = 0;

        while(index< input.length()) {

            String length = input.substring(index, input.indexOf("#", index));

            int numLength = Integer.parseInt(length);

            String currentString = input.substring(index + length.length() + 1, index + length.length() + 1 + numLength);
            resultStrings.add(currentString);

            index = index + length.length() + 1 + numLength;
        }

        return resultStrings;
    }
}
