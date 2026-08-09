class Solution {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for( char c : chars) {
            if (c == '(' || c == '{' || c == '[')
                stack.push(c);

            if((c == ')' || c == '}' || c == ']') && stack.isEmpty())
            {
                return false;
            }

            if ( (c == ')' ) && ( stack.pop() != '('))
            {
                return  false;
            }
            else if ( (c == '}' ) && ( stack.pop() != '{'))
            {
                return  false;
            }

            else if ( (c == ']' ) && ( stack.pop() != '['))
            {
                return  false;
            }
        }
        return stack.isEmpty();
    }
}
