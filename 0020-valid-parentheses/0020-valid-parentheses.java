class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<n;i++)
        {
            char c = s.charAt(i);
            if(c=='(' || c=='{' || c=='[')
            {
                stack.push(c);// Push opening brackets onto the stack
            }
            else{
                if(stack.isEmpty())
                {
                    return false;// No opening bracket for closing bracket
                }
                else{
                    char top=stack.pop();// Pop the top element to match
                    if((c==')' && top!='(') || (c=='}' && top!='{') || (c==']' && top!='['))
                    {
                        return false;// Mismatch found
                    }
                }
            }
        }
        return stack.isEmpty();// If the stack is empty, all brackets matched
    }
}