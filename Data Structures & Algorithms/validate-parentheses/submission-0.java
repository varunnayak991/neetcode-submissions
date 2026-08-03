class Solution {
    public boolean isValid(String s) {
        
        char[] charArray = s.toCharArray();

        Stack<Character> characterStack = new Stack<>();

        for(char c :charArray )
        {
            if(c == '{' || c == '(' || c == '[' )
            {
                characterStack.push(c);
            }
            else if(c == '}' || c == ')' || c == ']' )
            {
                if(characterStack.empty())
                {
                    return false;
                }

                Character c2 = characterStack.pop();

                if( !(((c == '}')&&(c2 == '{')) ||  ((c == ')')&&(c2 == '(')) || ((c == ']')&&(c2 == '['))))
                {
                    return false;
                }
            }else
            {
                continue;
            }
        }

        return characterStack.empty();
    }
}
