class Solution {

    public String encode(List<String> strs) {

        StringBuilder stringBuilder = new StringBuilder();

        for(String str: strs)
        {
            stringBuilder.append(str.length());
            stringBuilder.append("#");
            stringBuilder.append(str);
        }

        return stringBuilder.toString();

    }

    public List<String> decode(String str) {
               ArrayList<String> result = new ArrayList<>();
        String remainingString = str;

        while(remainingString.length()> 0) {
            // Build the number.
            int stringOffset = 0;
            int currentOffset = 0;
            String currentSring = "";


            while (remainingString.charAt(stringOffset + currentOffset) != '#') {
                currentSring = currentSring + remainingString.charAt(stringOffset + currentOffset);
                currentOffset++;
            }
            currentOffset++; // Ignore Separator #


            int stringlength = Integer.valueOf(currentSring);


            String resultString = remainingString.substring(stringOffset + currentOffset , stringOffset + currentOffset + stringlength);
            result.add(resultString);

            remainingString = remainingString.substring(stringOffset + currentOffset + stringlength, remainingString.length());
        }

        return result;
    }
}
