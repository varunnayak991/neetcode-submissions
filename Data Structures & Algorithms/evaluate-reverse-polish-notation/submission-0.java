class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<String> characterStack = new Stack<>();

        for(String s : tokens) {



            if(! "+-*/".contains(s))
            {
                characterStack.push(s);
            }
            else
            {
                int b = Integer.parseInt(characterStack.pop());
                int a = Integer.parseInt(characterStack.pop());
                int result = 0;

                if (s.equals("+"))
                {
                    result=a+b;
                }
                else if (s.equals("-"))
                {
                    result = a-b;
                }
                else if (s.equals("*"))
                {
                    result= a*b;
                }
                else if (s.equals("/"))
                {
                    result=a/b;
                }

                characterStack.push(Integer.toString(result));
            }
        }

        return  Integer.parseInt(characterStack.pop());

    }
}
