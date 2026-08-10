class Solution {
    public int evalRPN(String[] tokens) {
        
         Stack<String> stack = new Stack<>();

        for(String tok : tokens)
        {
            // if number

            if( !tok.equals("-") &&  !tok.equals("+") &&  !tok.equals("*") &&  !tok.equals("/"))
            {
                stack.push(tok);
            }
            else
            {
                Integer result = 0;
                Integer op2 = Integer.valueOf( stack.pop());
                Integer op1 = Integer.valueOf( stack.pop());
                if(tok.equals("+"))
                {
                  result = op1 + op2;

                }
                else if(tok.equals("-"))
                {
                    result = op1 - op2;

                }
                else if(tok.equals("*"))
                {
                    result = op1 * op2;

                }
                else if(tok.equals("/"))
                {
                    result = op1 / op2;

                }
                stack.push(String.valueOf(result));
            }
        }

        return Integer.parseInt(stack.pop());
    }
}
